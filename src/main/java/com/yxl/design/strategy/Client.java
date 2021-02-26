package com.yxl.design.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/26 15:37
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入支付方式（1微信/2支付宝/3银行卡/4苹果支付）：");
        int in = scanner.nextInt();
        PayContext payContext = null;
        switch (in){
            case 1:
                payContext = new PayContext(new WeChatPayStrategy());
                break;
            case 2:
                payContext = new PayContext(new AlipayPayStrategy());
                break;
            case 3:
                payContext = new PayContext(new CardPayStrategy());
                break;
            case 4:
                payContext = new PayContext(new ApplePayStrategy());
                break;
        }
        payContext.getPay();
        payContext.getRefund();


    }


}
