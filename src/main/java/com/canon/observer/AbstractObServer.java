package com.canon.observer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @ProjectName: basedesign
 * @Package: com.canon.observer
 * @ClassName: AbstractObServer
 * @Author: Canon
 * @Description:
 * @Date: 2020/3/13 10:50
 * @Version: 1.0
 */
public abstract class AbstractObServer<T> implements ObserverInterface<T> {



//    @Override
//    public Class<T> getImplmentsObject() {
//        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//        return (Class<T>) type;
//    }
}
