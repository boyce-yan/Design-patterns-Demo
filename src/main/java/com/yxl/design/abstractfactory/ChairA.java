package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:46
 */
public class ChairA implements Chair{
    @Override
    public void run() {
        System.out.println("可以自动加热!");
    }
}
