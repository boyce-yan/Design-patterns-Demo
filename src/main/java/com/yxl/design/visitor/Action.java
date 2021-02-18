package com.yxl.design.visitor;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:14
 */
public abstract class Action {

    /**
     * 得到男性的测评
     * @param man
     */
    public abstract void getManReslt(Man man);

    /**
     * 得到女性的测评
     * @param woman
     */
     public abstract void getWomanReslt(Woman woman);
}
