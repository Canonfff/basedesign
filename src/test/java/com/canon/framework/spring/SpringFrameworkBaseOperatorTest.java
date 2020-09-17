package com.canon.framework.spring;

import com.canon.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @PackageName: com.canon.framework.spring
 * @Description: spring基础操作类测试
 * @author: canon
 * @date: 2020/5/28 10:18
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:/application.xml")
public class SpringFrameworkBaseOperatorTest {
    @Autowired
    SpringFrameworkBaseOperator springFrameworkBaseOperator;

    @Test
    public void operatorTest() {
        springFrameworkBaseOperator.fn();
        System.err.println("operatorTest...");
        SpringFrameworkBaseOperator bean = SpringContextUtil.getBean(SpringFrameworkBaseOperator.class);

        System.out.println(springFrameworkBaseOperator.equals(bean));
    }
}
