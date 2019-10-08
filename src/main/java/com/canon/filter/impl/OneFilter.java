package com.canon.filter.impl;

import com.canon.filter.Filter;
import com.canon.filter.FilterChain;
import com.canon.model.FilterBean;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 15:52
 * @Description:
 */
@Component
public class OneFilter implements Filter<FilterBean> {

    @Override
    public void doFilter(FilterBean filterBean, FilterChain<FilterBean> chain, int index) {
        System.err.println("oneFilter do it work...");
        chain.doFilter(filterBean, ++index);
    }
}
