package com.canon;

import com.canon.filter.Filter;
import com.canon.filter.factory.FilterChainFactory;
import com.canon.filter.impl.FilterChainImpl;
import com.canon.model.FilterBean;
import com.canon.util.SpringContextUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application.xml")
public class AppTest {


//    @Autowired
//    SpringContextUtil springContextUtil;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ((Filter)SpringContextUtil.getBean("oneFilter")).doFilter(new FilterBean(), new FilterChainImpl(), 0);
    }
    @Test
    public void getBean() {
        Filter oneFilter = (Filter) SpringContextUtil.getBean("oneFilter");
        oneFilter.doFilter(new FilterBean(), new FilterChainImpl(), 0);
    }

    @Test
    public void testSpringAndFilter() {
        FilterChainFactory.getChain("filterChainImpl").doFilter(new FilterBean(), 0);
    }

    @Test
    public void testSPI(){
        
    }
}
