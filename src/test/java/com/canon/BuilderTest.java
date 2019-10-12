package com.canon;

import com.alibaba.fastjson.JSON;
import com.canon.builer.Director;
import com.canon.builer.Material;
import com.canon.builer.Product;
import com.canon.builer.impl.OneBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/12 10:48
 * @Description:建造者模式构建复杂对象
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/application.xml")
public class BuilderTest {

    @Test
    public void testBuilder() {
        Product product = Director.getInstance(new Material()).construct();
        System.out.println(JSON.toJSONString(product));

    }

    @Test
    public void  testThread() {
        OneBuilder builder = new OneBuilder(new Material());
        Product result = builder.getResult();
        result.setPartA("123123");
        OneBuilder oneBuilder = new OneBuilder(new Material());
        Product result2 = oneBuilder.getResult();
        System.out.println(JSON.toJSONString(result));
        System.out.println(JSON.toJSONString(result2));
    }
}
