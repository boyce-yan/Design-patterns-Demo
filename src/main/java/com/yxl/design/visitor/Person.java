package com.yxl.design.visitor;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:19
 */
public abstract class Person {

    /**
     * 让别人可以访问
     * @param action
     */
    public abstract void accept(Action action);
}
