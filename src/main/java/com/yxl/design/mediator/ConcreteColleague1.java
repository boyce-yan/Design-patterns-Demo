package com.yxl.design.mediator;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/23 17:47
 */
public class ConcreteColleague1 extends Colleague{

    private String name;


    public ConcreteColleague1(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("具体同"+name+"接收请求。" + message);
    }

    @Override
    public void send(Colleague c1, String message) {
        System.out.println("具体"+name+"发送请求：" + message);
        mediator.relay(c1, message);
    }
}
