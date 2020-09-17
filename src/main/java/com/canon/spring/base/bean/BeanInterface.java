package com.canon.spring.base.bean;

/**
 * @PackageName: com.canon.spring.base.lookup
 * @Description:
 * @author: canon
 * @date: 2020/9/16 15:17
 * @Version: 1.0
 */
public interface BeanInterface {

    default void execute() {
        System.out.println("hello world");
    }
}
