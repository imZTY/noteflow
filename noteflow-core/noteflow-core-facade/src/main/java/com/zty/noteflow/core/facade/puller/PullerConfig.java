package com.zty.noteflow.core.facade.puller;

/**
 * 用于反序列化
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 10:02
 */
public class PullerConfig {

    /**
     * 指定命名空间进行拉取，默认为空=拉取全部命名空间，若配置了则只会拉取指定命名空间下的文章
     */
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
