package com.canon.observer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EventListener;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 15:50
 * @Description:观察者模式监听器
 */
public interface ObserverInterface<T> {

    /**
     * 唤醒监听器
     * @param t
     */
    void notify(T t);


    /**
     * 获取泛型实例
     * @return
     */
    default Class<T> getImplmentsObject() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return (Class<T>) type;
    }

}
