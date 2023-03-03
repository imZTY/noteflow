package com.zty.noteflow.third.yuque.puller;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.bkood.yuque.YuQueClient;
import com.bkood.yuque.common.Config;
import com.bkood.yuque.common.Result;
import com.bkood.yuque.common.ResultList;
import com.bkood.yuque.entity.Book;
import com.bkood.yuque.entity.Doc;
import com.bkood.yuque.entity.DocDetail;
import com.bkood.yuque.entity.User;
import com.bkood.yuque.parameters.query.QueryReposDocParameters;
import com.zty.framework.exception.BusinessException;
import com.zty.framework.util.LocalDateTimeUtils;
import com.zty.framework.util.md5.MD5;
import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.context.DocContext;
import com.zty.noteflow.core.facade.puller.Puller;
import com.zty.noteflow.core.facade.puller.PullerConfig;
import com.zty.noteflow.third.facade.constants.ThirdConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 4:31
 */
public class YuquePuller extends Puller {

    private static final Logger logger = LoggerFactory.getLogger(YuquePuller.class);

    public YuquePuller(AccountSecretDO secret) {
        super(secret);
    }

    /**
     * 拉取文件内容
     * TODO 优化点：使用线程池并发获取内容
     * @param config 业务配置
     * @return 文章列表
     */
    @Override
    public List<DocContext> getDocsList(AccountSecretDO config) {
        List<DocContext> result = new ArrayList();
        // 反序列化业务配置
        PullerConfig pullerConfig = JSONObject.parseObject(config.getConfigJson(), PullerConfig.class);
        // 使用 secret 建立连接
        Config apiConfig = Config.builder()
                .token(this.secret.getToken())
                .build();
        // 获取用户信息
        Result<User> userResult = YuQueClient.query(apiConfig).user().run();
        User user = getIfSuccess(userResult, true);
        logger.debug("user={}", user);
        // 获取知识库
        ResultList<Book> repoResult = YuQueClient.query(apiConfig).usersRepos(String.valueOf(user.getId())).run();
        List<Book> repos = getIfSuccess(repoResult);
        logger.debug("repos={}", repos);
        String namespace = pullerConfig == null ? null : pullerConfig.getNamespace();
        repos.forEach(repo -> {
            if (null != namespace && !namespace.equals(repo.getNamespace())) {
                // 如果配了 namespace 则只会取指定 namespace 下的文章
                return;
            }
            // 获取文章列表
            ResultList<Doc> docsResult = YuQueClient.query(apiConfig).reposDocs(repo.getNamespace()).run();
            List<Doc> docs = getIfSuccess(docsResult);
            logger.debug("docs={}", docs);
            // 获取文章详情
            docs.forEach(doc -> {
                Result<DocDetail> docDetailResult = YuQueClient.query(apiConfig)
                        .reposDoc(repo.getNamespace(), doc.getSlug())
                        .parameter(QueryReposDocParameters::getRaw, 1)
                        .run();
                DocDetail docDetail = getIfSuccess(docDetailResult, false);
                if (null != docDetail) {
                    // 转成内部上下文
                    DocContext docContext = this.parseDocContext(docDetail);
                    result.add(docContext);
                } else {
                    logger.warn("无法获取文章详情,{},{}", repo.getNamespace(), doc.getSlug());
                }
            });
        });
        return result;
    }

    private DocContext parseDocContext(DocDetail docDetail) {
        DocContext docContext = new DocContext();
        docContext.setMarkdown(docDetail.getBody());
        docContext.setHtml(docDetail.getBodyHtml());
        docContext.setUpdateTime(LocalDateTimeUtils.ofEpochMilli(docDetail.getContentUpdatedAt().getTime()));
        try {
            docContext.setMd5(MD5.encrypt(docContext.getMarkdown()));
        } catch (NoSuchAlgorithmException e) {
            logger.error("MD5加密失败, ", e);
            throw new BusinessException("500", "找不到加密算法MD5," + e.getMessage());
        }
        return docContext;
    }

    private <T> List<T> getIfSuccess(ResultList<T> resultList) {
        if (ThirdConstant.SUCCESS_CODE == resultList.getStatus()) {
            return resultList.getEntity();
        } else {
            throw new BusinessException("455", "THIRD_REPLY_FAIL");
        }
    }

    private <T> T getIfSuccess(Result<T> result, boolean needThrow) {
        if (ThirdConstant.SUCCESS_CODE == result.getStatus()) {
            return result.getEntity();
        } else if (needThrow) {
            throw new BusinessException("455", "THIRD_REPLY_FAIL");
        } else {
            return null;
        }
    }
}
