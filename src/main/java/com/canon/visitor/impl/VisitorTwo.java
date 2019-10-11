package com.canon.visitor.impl;

import com.canon.visitor.ElementInterface;
import com.canon.visitor.VisitorInterface;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/11 11:39
 * @Description:
 */
@Component
public class VisitorTwo implements VisitorInterface {
    @Override
    public void visit(ElementInterface elementInterface) {
        elementInterface.operation();
    }
}
