package com.canon.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 11:33
 * @Description:
 */
public abstract class SPIUtil {


    public static<T> List<T> init(Class<T> clazz) {
        ServiceLoader<T> load = ServiceLoader.load(clazz);
        return getImplList(load);
    }

    public static<T> List<T> init(T t) {
        return (List<T>) init(t.getClass());
    }

    public static<T> List<T> init(Class<T> clazz, ClassLoader loader) {
        ServiceLoader<T> load = ServiceLoader.load(clazz, loader);
        return getImplList(load);
    }

    public static<T> List<T> init(T t, ClassLoader loader) {
        return (List<T>) init(t.getClass(), loader);
    }

    static<T> List<T> getImplList(ServiceLoader<T> load) {
        List<T> impls = new ArrayList<T>();
        Iterator<T> iterator = load.iterator();
        while (iterator.hasNext()) {
            impls.add(iterator.next());
        }
        return impls;
    }
}
