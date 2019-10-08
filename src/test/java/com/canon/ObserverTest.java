package com.canon;

import com.canon.model.OneEvent;
import com.canon.observer.impl.OneSubject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 17:41
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application.xml")
public class ObserverTest {

    @Autowired
    OneSubject oneSubject;

    @Test
    public void testObserver() {
        oneSubject.execute(new OneEvent());
    }
}
