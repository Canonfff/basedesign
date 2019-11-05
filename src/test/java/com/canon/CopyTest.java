package com.canon;

import com.canon.model.DefaultModel;
import com.canon.model.SubModel;
import org.junit.Test;

/**
 * @Author Canon
 * @Date:Created in 1:35 2019/10/26
 * @Modify By: canon
 * @Despricction:
 * @since 1.0
 */
public class CopyTest {
    @Test
    public void testCopyClass() {
        DefaultModel defaultModel = new DefaultModel();
        defaultModel.setDefaultKey("wc");
        DefaultModel subModel = new DefaultModel(defaultModel);
        System.out.println(subModel.getDefaultKey());
    }

}
