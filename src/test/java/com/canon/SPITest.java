package com.canon;

import com.canon.spi.SPIInterface;
import com.canon.util.SPIUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 11:47
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application.xml")
public class SPITest {

    @Test
    public void getSPI() {
        List<SPIInterface> list = SPIUtil.init(SPIInterface.class);
        System.err.println(list);
        System.err.println(list.size());
    }
}
