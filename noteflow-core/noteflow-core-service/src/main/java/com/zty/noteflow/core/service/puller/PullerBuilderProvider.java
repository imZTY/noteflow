package com.zty.noteflow.core.service.puller;

import java.util.HashMap;
import java.util.Map;

import com.zty.noteflow.core.facade.enums.PullerSource;
import com.zty.noteflow.core.facade.puller.PullerBuilder;
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
public class PullerBuilderProvider implements ApplicationContextAware {

    private final Map<PullerSource, PullerBuilder> cacheMap = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PullerBuilder> builders = applicationContext.getBeansOfType(PullerBuilder.class);
        if (CollectionUtils.isEmpty(builders)) {
            throw new BeanInitializationException("未注册任何PullerBuilder");
        }
        builders.forEach((name, bean) -> cacheMap.put(bean.getSource(), bean));
    }

    public PullerBuilder getBySource(PullerSource pullerSource) {
        return cacheMap.get(pullerSource);
    }
}
