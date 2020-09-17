package com.canon.spring.base.replaced;

import com.canon.spring.base.replaced.annotation.ReplacedMethod;
import org.springframework.stereotype.Component;

/**
 * @PackageName: com.canon.spring.base
 * @Description:
 * @author: canon
 * @date: 2020/9/16 15:40
 * @Version: 1.0
 */
@Component
public class BaseReplaced {

    @ReplacedMethod(replacer = "baseMethodReplace", argType = {"123","456"})
    public void execute() {
        System.out.println("old method");
    }

    @ReplacedMethod(replacer = "baseMethodReplace", argType = {"123","456"})
    public void execute2() {
        System.out.println("execute2");
    }
}
