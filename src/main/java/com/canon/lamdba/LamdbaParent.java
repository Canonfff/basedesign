package com.canon.lamdba;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @PackageName: com.canon.lamdba
 * @Description: lambda
 * @author: canon
 * @date: 2020/5/29 15:45
 * @Version: 1.0
 */
public class LamdbaParent {

    public void execute(IFunction function) {
        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        function.doExecute(list);
    }
}
