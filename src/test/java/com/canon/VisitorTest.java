package com.canon;

import com.canon.visitor.Structure;
import com.canon.visitor.VisitorInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/11 13:58
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application.xml")
public class VisitorTest {

    @Qualifier("visitorOne")
    @Autowired(required = false)
    VisitorInterface visitorInterface;

    @Autowired
    Structure structure;

    @Test
    public void testSpringVisitor() {
        structure.accept(visitorInterface);
    }
}
