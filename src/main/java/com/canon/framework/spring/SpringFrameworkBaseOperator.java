package com.canon.framework.spring;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @PackageName: com.canon.framework.spring
 * @Description: spring框架基础操作
 * @author: canon
 * @date: 2020/5/28 10:03
 * @Version: 1.0
 */
@Component // 组件化标识
@Lazy(value = false)// 是否懒加载
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) // 单例
@EnableAsync// 开启异步注解,需要配置spring的task
@Configuration// 标识配置类
public class SpringFrameworkBaseOperator implements InitializingBean {


    @Bean
    public TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 初始化bean完成之后扩展
        System.out.println("afterPropertiesSet...");
    }

    // jdk 自带的注解,标识servlet标准在加载完成bean以及依赖之后,会调用此方法
    @PostConstruct
    public void init() {
        System.out.println("init...");
    }

    @Async// 标识异步处理
    public void fn() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("fn...");
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(this);

        initBeanWrapper(bw);
    }

    // 模板方法 设置属性
    protected void initBeanWrapper(BeanWrapper bw) {
        
    }
}
