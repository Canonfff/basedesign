package com.canon.spring.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public abstract class SpringObjectFactoryBean implements FactoryBean<SpringObjectFactoryBean>, InstantiationAwareBeanPostProcessor {

    @Override
    public SpringObjectFactoryBean getObject() throws BeansException {
        return new SpringObjectFactoryBean() {};
    }

    @Override
    public Class<?> getObjectType() {
        return SpringObjectFactoryBean.class;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return getObject();
    }
}
