package com.zty.noteflow.core.facade.pusher;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.enums.PusherSource;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:33
 */
public abstract class PusherBuilder {

    public abstract Pusher buildPusherBySecret(AccountSecretDO secret);

    public abstract PusherSource getSource();
}
