package com.canon.framework.spring;

import com.canon.spring.base.lookup.BaseLookup;
import com.canon.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @PackageName: com.canon.framework.spring
 * @Description:
 * @author: canon
 * @date: 2020/9/16 15:24
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class LookupTest {

    @Test
    public void lookupTest() {
        BaseLookup bean = SpringContextUtil.getBean(BaseLookup.class);
        bean.handler();
    }
}
