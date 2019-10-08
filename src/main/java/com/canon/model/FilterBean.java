package com.canon.model;

import java.io.Serializable;

/**
 * @author 0227544
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/9/27 16:10
 * @Description:
 */
public class FilterBean implements Serializable {
    private static final long serialVersionUID = -6336155785965693329L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
