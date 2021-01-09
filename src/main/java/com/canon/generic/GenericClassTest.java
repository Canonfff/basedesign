package com.canon.generic;

import com.canon.generic.impl.GenericSubOneClass;
import com.canon.generic.impl.GenericSubTwoClass;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest {
    public static void main(String[] args) {
        List<GenericInterface> interfaces = getInterfaces();
        for (GenericInterface is : interfaces) {
            System.out.println(is.getTyp().getSimpleName());
        }
    }

    static List<GenericInterface> getInterfaces() {
        List<GenericInterface> interfaces = new ArrayList<>();
        interfaces.add(new GenericOtherOneClass());
        interfaces.add(new GenericOtherTwoClass());
        interfaces.add(new GenericSubOneClass());
        interfaces.add(new GenericSubTwoClass());
        return interfaces;
    }
}
