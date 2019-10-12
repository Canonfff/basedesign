package com.canon.builer;

import com.canon.builer.factory.BuilderFactory;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/12 09:59
 * @Description:
 */
public class Director {

    // 建造者
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        return builder.getResult();
    }

    public static Director getInstance(Material material) {
        Builder builder = BuilderFactory.getBuilder(material);
        return new Director(builder);
    }

}
