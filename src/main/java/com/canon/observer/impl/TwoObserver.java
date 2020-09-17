package com.canon.observer.impl;

import com.canon.model.TwoEvent;
import com.canon.observer.AbstractObServer;
import com.canon.observer.ObserverInterface;
import org.springframework.stereotype.Component;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:42
 * @Description:
 */
@Component
public class TwoObserver implements ObserverInterface<TwoEvent> {
    @Override
    public void notify(TwoEvent twoEvent) {
        System.err.println("TwoObserver do it work...");
    }


}
