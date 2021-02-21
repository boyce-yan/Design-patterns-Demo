package com.yxl.design.observer;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/21 18:09
 */
public class ConcrereObserver implements Observer{


    private String name;

    public ConcrereObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        CurrentCondition currentCondition = new CurrentCondition(name,temperature,pressure,humidity);
    }
}
