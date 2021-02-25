package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:45
 */
public class EngineB implements Engine{

    @Override
    public void run() {
        System.out.println("转的慢!");
    }

    @Override
    public void start() {
        System.out.println("启动快,手动档");
    }

}
