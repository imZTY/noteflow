package com.zty.noteflow.core.facade.puller;

import java.util.List;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.context.DocContext;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:34
 */
public abstract class Puller {

    protected AccountSecretDO secret;

    public Puller(AccountSecretDO secret) {
        this.secret = secret;
    }

    /**
     * 拉取文件内容
     * @param config 业务配置
     * @return 文章列表
     */
    public abstract List<DocContext> getDocsList(AccountSecretDO config);
}
