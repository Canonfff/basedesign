package com.canon.visitor.impl;

import com.canon.visitor.ElementInterface;
import com.canon.visitor.VisitorInterface;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/11 11:37
 * @Description:
 */
@Component
public class ElementOne implements ElementInterface {
    @Override
    public void accept(VisitorInterface visitorInterface) {
        visitorInterface.visit(this);
    }

    @Override
    public void operation() {
        System.out.println("ElementOne");
    }
}
