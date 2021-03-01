package com.yxl.design.state;

import java.util.Random;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 21:27
 */
public class CanRaffleState extends State{

    //初始化活动引用
    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖 ……");
        Random r = new Random();
        int num = r.nextInt(5);
        if(num == 0){
            System.out.println("中奖了");
            raffleActivity.setState(raffleActivity.getDispenseState());
            //发放奖品
            return true;
        }else {
            System.out.println("很遗憾，没有中奖");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
