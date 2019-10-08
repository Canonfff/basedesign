package com.canon.spi.impl;

import com.canon.spi.SPIInterface;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 10:55
 * @Description:
 */
public class OneSPI implements SPIInterface {
    @Override
    public void execute() {
        System.err.println("OneSPI do it work...");
    }
}
