package org.apache.dubbo.demo.consumer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author zhaoqi
 * @since 2021-03-10
 */

public class SpringUtils implements ApplicationContextAware  {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext=applicationContext;
    }


    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
