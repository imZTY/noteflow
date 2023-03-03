package com.zty.noteflow.core.facade.puller;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.enums.PullerSource;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:33
 */
public abstract class PullerBuilder {

    public abstract Puller buildPullerBySecret(AccountSecretDO secret);

    public abstract PullerSource getSource();
}
