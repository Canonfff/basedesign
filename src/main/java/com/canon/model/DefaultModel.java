package com.canon.model;

import java.io.Serializable;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 15:53
 * @Description:
 */
public class DefaultModel implements Serializable {

    private static final long serialVersionUID = 624491934498891975L;

    private String defaultKey;

    public String getDefaultKey() {
        return defaultKey;
    }

    public void setDefaultKey(String defaultKey) {
        this.defaultKey = defaultKey;
    }
}
