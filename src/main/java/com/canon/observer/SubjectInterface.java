package com.canon.observer;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:48
 * @Description:
 */
public interface SubjectInterface<T> {

    /**
     * 执行核心逻辑
     * @param t
     */
    void execute(T t);


}
