package com.canon.spring.base.replaced;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @PackageName: com.canon.spring.base.replaced
 * @Description:
 * @author: canon
 * @date: 2020/9/16 16:07
 * @Version: 1.0
 */
@Component
public class BaseMethodReplace implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("new method");
        return null;
    }
}
