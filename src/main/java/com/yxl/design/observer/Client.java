package com.yxl.design.observer;

import java.util.Observable;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/21 18:21
 */
public class Client {

    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        ConcrereObserver concrereObserver = new ConcrereObserver("1");
        ConcrereObserver concrereObserver2 = new ConcrereObserver("2");
        concreteSubject.registerObserver(concrereObserver);
        concreteSubject.registerObserver(concrereObserver2);
        //通知用户
        concreteSubject.notifyObserver(1,1,1);

    }
}
