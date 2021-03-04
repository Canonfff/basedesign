package com.canon.spring.base.beanwrapper;

import com.google.common.collect.Maps;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SpringBeanWrapper
 * @Description
 * @Author Canon
 * @Date 2021/3/4 14:14
 */
public class SpringBeanWrapper {

    private String name;

    private String nickName;


    public void init() {
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(this);
        beanWrapper.setPropertyValues(properties());

        System.out.println("out put [name] : " + name);
        System.out.println("out put [nickName] : " + nickName);
    }

    public Map<String, String> properties() {
        HashMap<String, String> map = Maps.newHashMap();
        map.put("name", "zhanzifan");
        map.put("nickName", "canon");
        return map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public static void main(String[] args) {
        SpringBeanWrapper wrapper = new SpringBeanWrapper();
        wrapper.init();
    }
}
