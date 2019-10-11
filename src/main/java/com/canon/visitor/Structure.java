package com.canon.visitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/11 11:43
 * @Description:
 */
@Component
public class Structure {

    @Autowired
    private List<ElementInterface> elementInterfaces;

    public void accept(VisitorInterface visitorInterface) {
        Iterator<ElementInterface> iterator = elementInterfaces.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitorInterface);
        }
    }

}
