package com.canon.framework.spring;

import com.canon.BaseTest;
import com.canon.spring.base.replaced.BaseReplaced;
import com.canon.util.SpringContextUtil;
import org.junit.Test;

/**
 * @PackageName: com.canon.framework.spring
 * @Description:
 * @author: canon
 * @date: 2020/9/16 16:42
 * @Version: 1.0
 */

public class ReplacedTest extends BaseTest {

    @Test
    public void replaceTest() {
        BaseReplaced bean = SpringContextUtil.getBean(BaseReplaced.class);
        bean.execute();
    }
}
