package com.canon.spi.impl;

import com.canon.spi.SPIInterface;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/8 10:56
 * @Description:
 */
public class TwoSPI implements SPIInterface {
    @Override
    public void execute() {
        System.err.println("TwoSPI do it work...");
    }
}
