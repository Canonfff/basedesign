package com.canon.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 18:05
 * @Description:
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        setStaticApplicationContext(applicationContext);
    }

    public static ApplicationContext setStaticApplicationContext(ApplicationContext applicationContext) {
        return SpringContextUtil.applicationContext = applicationContext;
    }

    public static<T> T getBean(String beanName){
        return (T)applicationContext.getBean(beanName);
    }

    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    public static<T> T getBean(String name, Class<T> clazz) {
        return applicationContext.getBean(name, clazz);
    }

    public static Object getBean(String name, Object... params) {
        return applicationContext.getBean(name, params);
    }

}
