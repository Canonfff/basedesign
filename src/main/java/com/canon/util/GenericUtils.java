package com.canon.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @ClassName GenericUtils
 * @Description 反射工具类
 * @Author Canon
 * @Date 2021/1/21 14:13
 */
public abstract class GenericUtils {

    public static <T> Class<T> getGenericClass(Class clazz, int index) {
        Class argumentClass = Object.class;
        scan: {
            Type[] types = clazz.getGenericInterfaces();
            for (Type type : types) {
                if (type instanceof ParameterizedType) {
                    argumentClass = (Class) ((ParameterizedType) type).getActualTypeArguments()[index];
                    break scan;
                }
            }

            do {
                Type superType = clazz.getGenericSuperclass();
                if (superType instanceof ParameterizedType) {
                    argumentClass = (Class) ((ParameterizedType) superType).getActualTypeArguments()[index];
                    break scan;
                }
                clazz = clazz.getSuperclass();
            } while (clazz != Object.class);
        }
        return argumentClass;
    }

    public static String getGenericClassName(Class clazz, int index) {
        return getGenericClass(clazz, index).getSimpleName();
    }

    public static <T> Class<T> getGenericClass(Class clazz) {
        return getGenericClass(clazz, 0);
    }
}
