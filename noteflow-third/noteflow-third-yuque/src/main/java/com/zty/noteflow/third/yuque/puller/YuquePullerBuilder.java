package com.zty.noteflow.third.yuque.puller;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.enums.PullerSource;
import com.zty.noteflow.core.facade.puller.Puller;
import com.zty.noteflow.core.facade.puller.PullerBuilder;
import org.springframework.stereotype.Component;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 4:30
 */
@Component
public class YuquePullerBuilder extends PullerBuilder {

    @Override
    public Puller buildPullerBySecret(AccountSecretDO secret) {
        return new YuquePuller(secret);
    }

    @Override
    public PullerSource getSource() {
        return PullerSource.YUQUE;
    }
}
