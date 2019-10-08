package com.canon.model;

import java.io.Serializable;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:45
 * @Description:
 */
public class TwoEvent implements Serializable {
    private static final long serialVersionUID = 5344686350469177211L;

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
