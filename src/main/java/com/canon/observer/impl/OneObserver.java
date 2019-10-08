package com.canon.observer.impl;

import com.canon.model.OneEvent;
import com.canon.observer.ObserverInterface;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 15:53
 * @Description:
 */
@Component
public class OneObserver implements ObserverInterface<OneEvent> {

    @Override
    public void notify(OneEvent oneEvent) {
        System.out.println("OneObserver do it work...");
    }

    @Override
    public Class<OneEvent> getImplmentsObject() {
        return OneEvent.class;
    }
}
