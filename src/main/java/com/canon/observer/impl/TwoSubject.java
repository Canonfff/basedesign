package com.canon.observer.impl;

import com.canon.model.TwoEvent;
import com.canon.observer.SubjectInterface;
import com.canon.observer.factory.ObserverFactory;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:50
 * @Description:
 */
@Component
public class TwoSubject implements SubjectInterface<TwoEvent> {
    @Override
    public void execute(TwoEvent twoEvent) {
        System.err.println("TwoSubject execute it work...");
        ObserverFactory.execute(twoEvent);
    }
}
