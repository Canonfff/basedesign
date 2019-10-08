package com.canon.observer.factory;

import com.canon.observer.ObserverInterface;
import com.canon.util.SpringContextUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 16:51
 * @Description:
 */
@Component
public abstract class ObserverFactory<T> {

    public static<T> List<ObserverInterface> getObservers(T t) {
        Assert.notNull(t, "传入对象不能为空");
        ObserverContext context = (ObserverContext) SpringContextUtil.getBean("observerContext");
        return context.getObservers(t);
    }

    public static<T> void execute(T t){
        List<ObserverInterface> observers = getObservers(t);
        for (ObserverInterface observer : observers) {
            observer.notify(t);
        }
    }

}
