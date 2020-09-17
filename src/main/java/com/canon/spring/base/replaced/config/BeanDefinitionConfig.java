package com.canon.spring.base.replaced.config;

import com.canon.spring.base.replaced.annotation.ReplacedMethod;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.ReplaceOverride;
import org.springframework.core.MethodIntrospector;
import org.springframework.core.MethodIntrospector.MetadataLookup;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils.MethodFilter;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Map;

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
            // fn(beanDefinition);
            String className = beanDefinition.getBeanClassName();
            Class<?> clazz = null;
            if (className == null) {
                return;
            }
            try {
                clazz = ClassUtils.forName(className, null);
                // Set<Method> methods = MethodIntrospector.selectMethods(clazz, INIT_REPLACED_METHODS);
                Map<Method, ReplacedMethod> methods = MethodIntrospector.selectMethods(clazz, (MetadataLookup<ReplacedMethod>) method -> {
                    return getReplacedMethod(method);
                });
                methods.forEach((method,replacedMthod) -> BeanDefinitionConfigHolder.registerReplaceMethodHandler(beanDefinition, method, replacedMthod));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private ReplacedMethod getReplacedMethod(AnnotatedElement element) {
        return AnnotatedElementUtils.findMergedAnnotation(element, ReplacedMethod.class);
    }

    private void fn(AbstractBeanDefinition beanDefinition) {
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
                // BeanDefinitionConfigHolder.replaceMethodHandler(beanDefinition, method);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
        public static void registerReplaceMethodHandler(AbstractBeanDefinition bd, Method oldMethod, ReplacedMethod method) {
            String name = oldMethod.getName();
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
