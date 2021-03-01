package com.yxl.design.state;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 21:52
 */
public class DispenseOutState extends State{

    //初始化活动引用
    RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }


    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，下次参加");
    }
}
