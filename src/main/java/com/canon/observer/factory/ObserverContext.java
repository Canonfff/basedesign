package com.canon.observer.factory;

import com.canon.observer.ObserverInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 17:32
 * @Description:
 */
@Component
public class ObserverContext<T> {

    @Autowired
    private List<ObserverInterface> observerInterfaces;

    public List<ObserverInterface> getObservers(T t) {
        Assert.notEmpty(observerInterfaces, "依赖注入失败或者不不存在该接口的实现");
        List<ObserverInterface> results = new ArrayList<ObserverInterface>();
        for (ObserverInterface instance : observerInterfaces) {
            Class implmentsObject = instance.getImplmentsObject();
            if (implmentsObject.isInstance(t)) {
                results.add(instance);
            }
        }
        Assert.notEmpty(results, "找不到该实体类的监听[" + t.getClass() + "]");
        return results;
    }
}
