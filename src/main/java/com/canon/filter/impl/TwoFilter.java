package com.canon.filter.impl;

import com.canon.filter.Filter;
import com.canon.filter.FilterChain;
import com.canon.model.FilterBean;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 10:10
 * @Description:
 */
@Component
public class TwoFilter implements Filter<FilterBean> {
    @Override
    public void doFilter(FilterBean filterBean, FilterChain<FilterBean> chain, int index) {
        System.err.println("twoFilter do it work...");
        chain.doFilter(filterBean, ++index);
    }
}
