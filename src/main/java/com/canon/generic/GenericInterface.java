package com.canon.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface GenericInterface <T> {

    default Class<T> getTyp() {
        Class<? extends GenericInterface> clazz = this.getClass();

        Class typeClazz = Object.class;
        scan : {
            Type[] genericInterfaces = clazz.getGenericInterfaces();
            for (Type genericInterface : genericInterfaces) {
                if (genericInterface instanceof ParameterizedType) {
                    typeClazz = (Class) ((ParameterizedType) genericInterface).getActualTypeArguments()[0];
                    break scan;
                }
            }
            Class clz = clazz;
            do {
                Type genericSuperclass = clz.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    typeClazz = (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                    break scan;
                }
                clz = clz.getSuperclass();
            } while (clz != Object.class);
        }

        return typeClazz;
    }
}
