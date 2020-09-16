package com.canon.spring.base.lookup;

import com.canon.spring.base.bean.BeanInterface;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @PackageName: com.canon.spring.base.lookup
 * @Description:
 * @author: canon
 * @date: 2020/9/16 15:16
 * @Version: 1.0
 */
@Component
public abstract class BaseLookup {

    public void handler() {
        getBean().execute();
    }

    @Lookup("beanTwo")
    public abstract BeanInterface getBean();

}
