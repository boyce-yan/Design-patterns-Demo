package com.yxl.design.state;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 21:35
 */
public class DispenseState extends State{

    //初始化活动引用
    RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (raffleActivity.getCount() > 0){
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        }else{
            System.out.println("奖品发完了");
            raffleActivity.setState(raffleActivity.getDispenseState());
        }
    }
}
