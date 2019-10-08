package com.canon.filter.factory;

import com.canon.filter.FilterChain;
import com.canon.util.PropertiesFileUtil;
import com.canon.util.SpringContextUtil;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 18:04
 * @Description:
 */
public abstract class FilterChainFactory {

    public static FilterChain getChain(String beanName) {
        return (FilterChain)SpringContextUtil.getBean(beanName);
    }

    public static FilterChain getChain() {
        String beanName = PropertiesFileUtil.getProperties("FilterChain");
        return getChain(beanName);
    }

    public static FilterChain getChainByConfig(String key) {
        String beanName = PropertiesFileUtil.getProperties(key);
        return getChain(beanName);
    }
}
