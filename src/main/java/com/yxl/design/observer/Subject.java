package com.yxl.design.observer;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/21 17:47
 */
public interface Subject {

    /**
     * 注册观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObserver(float temperature, float pressure, float humidity);

}
