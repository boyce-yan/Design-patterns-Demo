package com.yxl.design.state;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/25 22:03
 */
public class Client {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 1; i < 10; i++) {
            System.out.println("----------第" +i+"次抽奖---------");
            //扣积分
            raffleActivity.debuctMoney();
            raffleActivity.raffle();
        }
    }
}
