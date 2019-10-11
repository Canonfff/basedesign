package com.canon.visitor;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/11 11:34
 * @Description:
 */
public interface ElementInterface {

    void accept(VisitorInterface visitorInterface);

    void operation();
}
