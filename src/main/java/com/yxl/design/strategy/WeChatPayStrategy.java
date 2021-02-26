package com.yxl.design.strategy;

import java.math.BigDecimal;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/26 15:21
 */
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public void unifiedOrder(Integer orderId, BigDecimal price) {
        System.out.println("微信下单支付");
    }


    @Override
    public boolean refund(Integer orderId) {
        System.out.println("微信退款成功");
        return true;
    }

}
