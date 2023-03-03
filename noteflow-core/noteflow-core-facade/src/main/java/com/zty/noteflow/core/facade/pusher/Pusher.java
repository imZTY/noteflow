package com.zty.noteflow.core.facade.pusher;

import java.util.List;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.context.FileContext;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:34
 */
public abstract class Pusher {

    private AccountSecretDO secret;

    public Pusher(AccountSecretDO secret) {
        this.secret = secret;
    }

    /**
     * 将文章发布
     * @param fileContexts 文件列表
     * @param config 业务配置
     * @return 发布结果(会更新到fileContexts里)
     */
    public abstract void pushDocs(List<FileContext> fileContexts, AccountSecretDO config);
}
