package com.canon.model;

import java.io.Serializable;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:44
 * @Description:
 */
public class OneEvent implements Serializable {

    private static final long serialVersionUID = -6401565539985210904L;

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
