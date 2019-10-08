package com.canon.filter;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 15:51
 * @Description:
 */
public interface Filter<T> {
    /**
     * 执行方法
     * @param t 参数
     * @param chain 执行链
     * @param index 执行器索引
     */
    void doFilter(T t, FilterChain<T> chain, int index);
}
