package com.canon.builer.impl;

import com.canon.builer.Builder;
import com.canon.builer.Material;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/12 10:00
 * @Description:
 */
public class OneBuilder extends Builder {


    public OneBuilder(Material material) {
        super(material);
    }

    @Override
    protected void builderPartA() {
        product.setPartA("set partA");
        System.out.println("builderPartA");
    }

    @Override
    protected void builderPartB() {
        product.setPartB("set partB");
        System.out.println("builderPartB");
    }

    @Override
    protected void builderPartC() {
        product.setPartC("set partC");
        System.out.println("builderPartC");
    }

    @Override
    protected void build() {
        builderPartA();
        builderPartB();
        builderPartC();
        System.out.println("finish build");
    }
}
