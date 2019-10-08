package com.canon.filter;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 16:08
 * @Description:
 */
public interface FilterChain<T> {

    /**
     * 执行方法
     * @param t 参数
     * @param index 执行器索引
     */
    void doFilter(T t, int index);

    /**
     * 执行方法
     * @param t 参数
     */
    void doFilter(T t);
}
