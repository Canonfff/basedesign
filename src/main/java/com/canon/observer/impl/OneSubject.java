package com.canon.observer.impl;

import com.canon.model.OneEvent;
import com.canon.observer.SubjectInterface;
import com.canon.observer.factory.ObserverFactory;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:49
 * @Description:
 */
@Component
public class OneSubject implements SubjectInterface<OneEvent> {
    @Override
    public void execute(OneEvent oneEvent) {
        System.out.println("OneSubject execute it work...");
        ObserverFactory.execute(oneEvent);
    }
}
