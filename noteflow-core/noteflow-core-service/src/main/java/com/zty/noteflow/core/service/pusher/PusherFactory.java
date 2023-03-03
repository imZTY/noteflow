package com.zty.noteflow.core.service.pusher;

import java.util.ArrayList;
import java.util.List;

import com.zty.framework.exception.BusinessException;
import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.Factory;
import com.zty.noteflow.core.facade.enums.PusherSource;
import com.zty.noteflow.core.facade.pusher.Pusher;
import com.zty.noteflow.core.facade.pusher.PusherBuilder;
import com.zty.noteflow.core.service.AccountSecretService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:32
 */
public class PusherFactory implements Factory<Pusher> {

    private final Logger logger = LoggerFactory.getLogger(PusherFactory.class);

    @Autowired
    private PusherBuilderProvider builderProvider;

    @Autowired
    private AccountSecretService accountSecretService;

    @Override
    public List<Pusher> getByConfig(AccountSecretDO config) {
        // 根据 config 获取所有 builder
        List<PusherBuilder> matchedBuilders = this.getBuildersByConfig(config);
        // 如果无 builder 则抛异常
        if (CollectionUtils.isEmpty(matchedBuilders)) {
            logger.warn("找不到任何PusherBuilder, config={}", config);
            throw new BusinessException("404", "找不到任何PusherBuilder");
        }
        List<Pusher> result = new ArrayList<>();
        // 使用 builder 创建 pusher
        matchedBuilders.forEach(builder -> {
            // 根据 builder 的 source，查询获取用户的秘钥配置 secret，支持配置多个
            AccountSecretDO queryDO = makeQueryDO(builder, config);
            List<AccountSecretDO> secretList = accountSecretService.queryByDO(queryDO);
            if (CollectionUtils.isEmpty(secretList)) {
                logger.warn("用户{}未配置任何通道源{}的秘钥，不处理，config={}", config.getAccountId(), builder.getSource(), config);
                return;
            }
            // 使用查到的 secret 创建 pusher
            PusherBuilder pullerBuilder = builderProvider.getBySource(builder.getSource());
            secretList.forEach(secret -> result.add(pullerBuilder.buildPusherBySecret(secret)));
        });
        return result;
    }

    private AccountSecretDO makeQueryDO(PusherBuilder builder, AccountSecretDO config) {
        AccountSecretDO queryDO = new AccountSecretDO();
        queryDO.setDisabled((byte) 0);
        queryDO.setAccountId(config.getAccountId());
        queryDO.setConfigType(config.getConfigType());
        queryDO.setSourceMask(builder.getSource().getMask());
        return queryDO;
    }

    private List<PusherBuilder> getBuildersByConfig(AccountSecretDO config) {
        List<PusherBuilder> builders = new ArrayList<>();
        // 从 Spring 里按 Source 获取 Builder
        for (PusherSource pusherSource : PusherSource.values()) {
            if (config.isEnabled(pusherSource)) {
                builders.add(builderProvider.getBySource(pusherSource));
            }
        }
        return builders;
    }
}
