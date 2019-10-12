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
        product.setPartA("son set partA");
        System.out.println("son builderPartA");
    }

}
