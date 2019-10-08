package com.canon.filter.impl;

import com.canon.filter.Filter;
import com.canon.filter.FilterChain;
import com.canon.model.FilterBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 16:24
 * @Description:
 */
@Component
public class FilterChainImpl implements FilterChain<FilterBean> {

    private static int defaultIndex = 0;

    @Autowired
    private List<Filter> filters;

    @Override
    public void doFilter(FilterBean filterBean, int index) {
        if (filters == null || filters.size() == 0) {
            throw new RuntimeException("依赖注入失败或者未找到依赖,接口[com.canon.filter.Filter]");
        }

        if (index > filters.size()) {
            throw new IndexOutOfBoundsException("索引超过过滤链最大可执行数,index : [" + index + "],filters size: [" + filters.size() + "]");
        }
        if (index == filters.size()) {
            // 跳出递归条件...
            return;
        }
        filters.get(index).doFilter(filterBean, this, index);
    }

    @Override
    public void doFilter(FilterBean filterBean) {
        doFilter(filterBean, defaultIndex);
    }

}
