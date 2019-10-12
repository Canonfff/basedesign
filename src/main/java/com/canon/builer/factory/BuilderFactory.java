package com.canon.builer.factory;

import com.canon.builer.Builder;
import com.canon.builer.Material;
import com.canon.builer.impl.OneBuilder;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/12 10:17
 * @Description:
 */
public abstract class BuilderFactory {

    public static Builder getBuilder(Material material) {
        return new OneBuilder(material);
    }
}
