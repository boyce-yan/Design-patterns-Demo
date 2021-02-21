package com.yxl.design.observer;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/21 17:51
 */
public interface Observer {

    /**
     * 更新
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature,float pressure,float humidity);
}
