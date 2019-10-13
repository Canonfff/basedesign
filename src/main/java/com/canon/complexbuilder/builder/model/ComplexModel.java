package com.canon.complexbuilder.builder.model;

import java.io.Serializable;

/**
 * @Author Canon
 * @Date:Created in 13:56 2019/10/13
 * @Modify By: canon
 * @Despricction:
 * @since 1.0
 */
public class ComplexModel implements Serializable {
    private static final long serialVersionUID = 9054829402648226297L;
    // 复杂字段1
    private String filed1;
    // 复杂字段2
    private String filed2;
    // 复杂字段3
    private String filed3;
    // 复杂字段4
    private String filed4;
    // 复杂字段5
    private String filed5;


    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }

    public String getFiled4() {
        return filed4;
    }

    public void setFiled4(String filed4) {
        this.filed4 = filed4;
    }

    public String getFiled5() {
        return filed5;
    }

    public void setFiled5(String filed5) {
        this.filed5 = filed5;
    }
}
