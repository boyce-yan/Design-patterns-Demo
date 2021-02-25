package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:46
 */
public class ChairB implements Chair{
    @Override
    public void run() {
        System.out.println("不能加热!");
    }
}
