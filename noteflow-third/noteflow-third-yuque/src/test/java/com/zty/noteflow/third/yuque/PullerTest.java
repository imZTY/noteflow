package com.zty.noteflow.third.yuque;

import java.util.List;

import com.zty.noteflow.core.facade.context.DocContext;
import com.zty.noteflow.core.facade.puller.Puller;
import com.zty.noteflow.core.facade.puller.PullerBuilder;
import com.zty.noteflow.third.yuque.puller.YuquePullerBuilder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 5:03
 */
public class PullerTest {

    private final Puller puller;

    public PullerTest() {
        PullerBuilder builder = new YuquePullerBuilder();
        this.puller = builder.buildPullerBySecret(TestConfig.getSecret());
    }

    /**
     * 通过用户ID 获取某个用户知识库列表
     */
    @Test
    public void testClientUsersReposById() {
        List<DocContext> docsList = puller.getDocsList(TestConfig.getConfig());
        Assert.assertNotEquals(0, docsList.size());
    }
}
