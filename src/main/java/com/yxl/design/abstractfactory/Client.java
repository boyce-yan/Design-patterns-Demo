package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:48
 */
public class Client {

    public static void main(String[] args) {
        CarFactory carFactory=new JiLiFactory();
        Engine engine=carFactory.createEngine();
        engine.run();
        engine.start();

    }

}
