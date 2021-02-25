package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:44
 */
public class EngineA implements Engine{

    @Override
    public void run() {
        System.out.println("转的快!");
    }

    @Override
    public void start() {
        System.out.println("启动快,自动档");
    }
}
