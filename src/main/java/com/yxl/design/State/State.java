package com.yxl.design.State;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 13:10
 */
public abstract class State {

    /**
     * 扣除积分
     */
    public abstract void deductMoney();

    /**
     * 是否抽中奖品
     */
    public abstract boolean raffle();

    /**
     * 发放奖品
     */
    public abstract void dispensePrize();



}
