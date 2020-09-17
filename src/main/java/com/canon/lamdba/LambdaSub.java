package com.canon.lamdba;

import java.util.List;

/**
 * @PackageName: com.canon.lamdba
 * @Description:
 * @author: canon
 * @date: 2020/5/29 15:47
 * @Version: 1.0
 */
public class LambdaSub extends LamdbaParent {

    public void subExecute() {
        execute((aa) -> {
            core((List<String>) aa);
        });
    }

    public void core(List<String> list) {
        list.forEach(System.out :: println);
    }

}
