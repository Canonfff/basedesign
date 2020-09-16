package com.canon.spring.base.replaced.config;

import com.canon.spring.base.replaced.annotation.ReplacedMethod;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.ReplaceOverride;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * @PackageName: com.canon.spring.base.replaced.config
 * @Description:
 * @author: canon
 * @date: 2020/9/16 17:13
 * @Version: 1.0
 */
@Component
@Order(Integer.MAX_VALUE)
public class BeanDefinitionConfig implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        String[] names = registry.getBeanDefinitionNames();
        for (String name : names) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) registry.getBeanDefinition(name);
            String className = beanDefinition.getBeanClassName();
            Class<?> clazz = null;
            try {
                if (className != null) {
                    clazz =Class.forName(className);
                } else {
                    clazz = beanDefinition.getBeanClass();
                }
                ReplacedMethod method = clazz.getAnnotation(ReplacedMethod.class);
                if (method != null) {
                    BeanDefinitionConfigHolder.replaceMethodHandler(beanDefinition, method);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    static class BeanDefinitionConfigHolder {

        /**
         * replaceMethod handler update beanDefinition
         * @param bd
         * @param method
         */
        public static void replaceMethodHandler(AbstractBeanDefinition bd, ReplacedMethod method) {
            String name = method.name();
            String callback = method.replacer();
            String[] argTypes = method.argType();
            Assert.isTrue(!StringUtils.isAnyBlank(name, callback), "name or replacer can not be null");

            ReplaceOverride replaceOverride = new ReplaceOverride(name, callback);
            for (String argType : argTypes) {
                replaceOverride.addTypeIdentifier(argType);
            }
            bd.getMethodOverrides().addOverride(replaceOverride);
        }

    }
}
