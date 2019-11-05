package com.canon.util;

import com.canon.model.DefaultModel;

/**
 * @Author Canon
 * @Date:Created in 1:43 2019/10/26
 * @Modify By: canon
 * @Despricction:
 * @since 1.0
 */
public abstract class CopyUtil {

    public static void copy(DefaultModel source, DefaultModel target) {
        target = source;
    }
}
