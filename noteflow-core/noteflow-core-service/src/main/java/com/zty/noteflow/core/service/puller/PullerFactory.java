package com.zty.noteflow.core.service.puller;

import java.util.ArrayList;
import java.util.List;

import com.zty.framework.exception.BusinessException;
import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.Factory;
import com.zty.noteflow.core.facade.enums.PullerSource;
import com.zty.noteflow.core.facade.puller.Puller;
import com.zty.noteflow.core.facade.puller.PullerBuilder;
import com.zty.noteflow.core.service.AccountSecretService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:32
 */
@Service
public class PullerFactory implements Factory<Puller> {

    private final Logger logger = LoggerFactory.getLogger(PullerFactory.class);

    @Autowired
    private PullerBuilderProvider builderProvider;

    @Autowired
    private AccountSecretService accountSecretService;

    @Override
    public List<Puller> getByConfig(AccountSecretDO config) {
        // 根据 config 获取所有 builder
        List<PullerBuilder> matchedBuilders = this.getBuildersByConfig(config);
        // 如果无 builder 则抛异常
        if (CollectionUtils.isEmpty(matchedBuilders)) {
            logger.warn("找不到任何PullerBuilder, config={}", config);
            throw new BusinessException("404", "找不到任何PullerBuilder");
        }
        List<Puller> result = new ArrayList<>();
        // 使用 builder 创建 puller
        matchedBuilders.forEach(builder -> {
            // 根据 builder 的 source，查询获取用户的秘钥配置 secret
            AccountSecretDO queryDO = makeQueryDO(builder, config);
            List<AccountSecretDO> secretList = accountSecretService.queryByDO(queryDO);
            if (CollectionUtils.isEmpty(secretList)) {
                logger.warn("用户{}未配置任何通道源{}的秘钥，不处理，config={}", config.getAccountId(), builder.getSource(), config);
                return;
            }
            // 使用查到的 secret 创建 puller
            PullerBuilder pullerBuilder = builderProvider.getBySource(builder.getSource());
            secretList.forEach(secret -> result.add(pullerBuilder.buildPullerBySecret(secret)));
        });
        return result;
    }

    private AccountSecretDO makeQueryDO(PullerBuilder builder, AccountSecretDO config) {
        AccountSecretDO queryDO = new AccountSecretDO();
        queryDO.setDisabled((byte) 0);
        queryDO.setAccountId(config.getAccountId());
        queryDO.setConfigType(config.getConfigType());
        queryDO.setSourceMask(builder.getSource().getMask());
        return queryDO;
    }

    private List<PullerBuilder> getBuildersByConfig(AccountSecretDO config) {
        List<PullerBuilder> builders = new ArrayList<>();
        // 从 Spring 里按 Source 获取 Builder
        for (PullerSource pullerSource : PullerSource.values()) {
            if (config.isEnabled(pullerSource)) {
                builders.add(builderProvider.getBySource(pullerSource));
            }
        }
        return builders;
    }
}
