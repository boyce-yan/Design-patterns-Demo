package com.yxl.design.state;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 21:19
 */
public class NoRaffleState extends State{

    //初始化活动引用
    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分可以抽奖");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("输入积分才能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("当前状态不能发放奖品");
    }


}
