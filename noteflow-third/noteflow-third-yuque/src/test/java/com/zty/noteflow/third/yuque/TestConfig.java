package com.zty.noteflow.third.yuque;

import com.zty.framework.util.PropertyUtils;
import com.zty.noteflow.core.facade.DO.AccountSecretDO;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 5:09
 */
public class TestConfig {

    public static AccountSecretDO getSecret() {
        AccountSecretDO secret = new AccountSecretDO();
        secret.setToken(PropertyUtils.getValue("zty-config.properties", "token"));
        return secret;
    }

    public static AccountSecretDO getConfig() {
        AccountSecretDO config = new AccountSecretDO();
        String jsonConfig = "{\"namespace\":\"" +
                PropertyUtils.getValue("zty-config.properties", "testNamespace") +
                "\"}";
        config.setConfigJson(jsonConfig);
        return config;
    }
}
