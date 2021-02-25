package com.yxl.design.abstractfactory;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 17:47
 */
public class JiLiFactory implements CarFactory {
    @Override
    public Engine createEngine() {

        return new EngineA();
    }

    @Override
    public Chair createChair() {

        return new ChairA();
    }
}
