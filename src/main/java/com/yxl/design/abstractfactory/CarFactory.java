package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:47
 */
public interface CarFactory {

    // 创建发动机
    Engine createEngine();

    // 创建座椅
    Chair createChair();
}
