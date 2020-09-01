package com.canon.lamdba;

import com.google.common.collect.Lists;

import java.io.File;
import java.util.ArrayList;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/25 17:47
 * @Description:测试java8lamdba表达式
 */
public class LamdbaTest {

    public static void main(String[] args) {
        // list();
//        LambdaSub sub = new LambdaSub();
//        sub.subExecute();
        String url = "E:\\泰久信息工作笔记\\2020-06\\线上应急方案\\智慧旅游OTM平台应急预案（2020版）(1).docx";

        File file = new File(url);
        if (file.exists()) {
            System.out.println(file.getName());
        }
    }

    public static void list() {
        ArrayList<String> lists = Lists.newArrayList();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        lists.forEach(n -> System.out.println(n));
        System.out.println("############################################################");
        lists.forEach(System.out::println);
        System.out.println("############################################################");
        lists.forEach(n -> n.getClass());
    }
}
