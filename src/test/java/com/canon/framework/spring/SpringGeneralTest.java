package com.canon.framework.spring;

import com.canon.spring.factory.SpringObjectFactoryBean;
import com.canon.spring.factory.bean.ObjectFactoryBean;
import com.canon.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class SpringGeneralTest {

//    @Autowired
//    private ObjectFactoryBean objectFactoryBean;


    @Test
    public void testObjectFactory() {
        Object objectFactoryBean = SpringContextUtil.getBean(SpringObjectFactoryBean.class);

        System.out.println("bean class: " + objectFactoryBean.getClass().getName());
    }
}
