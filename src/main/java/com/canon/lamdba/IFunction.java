package com.canon.lamdba;

/**
 * @PackageName: com.canon.lamdba
 * @Description: 测试
 * @author: canon
 * @date: 2020/5/29 15:43
 * @Version: 1.0
 */
@FunctionalInterface
public interface IFunction<T> {

    void doExecute(T t);
}
