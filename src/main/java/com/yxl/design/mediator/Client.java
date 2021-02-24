package com.yxl.design.mediator;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/23 21:11
 */
public class Client {

    public static void main(String[] args) {
        Mediator md = new ConcreteMediator("中介者");
        Colleague c1 = new ConcreteColleague1("张三");
        md.register(c1);
        Colleague c2 = new ConcreteColleague2("李四");
        md.register(c2);
        System.out.println("-------------");
        c1.send(c1,"买车");
        c2.send(c2,"买房");
    }
}
