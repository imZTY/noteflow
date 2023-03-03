package com.zty.noteflow.core.service.pusher;

import java.util.HashMap;
import java.util.Map;

import com.zty.noteflow.core.facade.enums.PusherSource;
import com.zty.noteflow.core.facade.pusher.PusherBuilder;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 1:37
 */
@Service
public class PusherBuilderProvider implements ApplicationContextAware {

    private final Map<PusherSource, PusherBuilder> cacheMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PusherBuilder> builders = applicationContext.getBeansOfType(PusherBuilder.class);
        if (CollectionUtils.isEmpty(builders)) {
            throw new BeanInitializationException("未注册任何PusherBuilder");
        }
        builders.forEach((name, bean) -> cacheMap.put(bean.getSource(), bean));
    }

    public PusherBuilder getBySource(PusherSource pullerSource) {
        return cacheMap.get(pullerSource);
    }
}
