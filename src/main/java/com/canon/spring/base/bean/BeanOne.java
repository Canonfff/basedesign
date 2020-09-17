package com.canon.spring.base.bean;

import org.springframework.stereotype.Service;

/**
 * @PackageName: com.canon.spring.base.lookup
 * @Description:
 * @author: canon
 * @date: 2020/9/16 15:19
 * @Version: 1.0
 */
@Service("beanOne")
public class BeanOne implements BeanInterface {
    @Override
    public void execute() {
        System.out.println("BeanOne");
    }
}
