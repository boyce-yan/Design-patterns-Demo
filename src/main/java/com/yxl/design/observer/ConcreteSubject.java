package com.yxl.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/21 18:03
 */
public class ConcreteSubject implements Subject {

    //储存订阅
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(float temperature, float pressure, float humidity) {
        observerList.stream().forEach( bean -> {
            System.out.printf("通知订阅用户 ：");
            bean.update(temperature,pressure,humidity);
        });
    }
}
