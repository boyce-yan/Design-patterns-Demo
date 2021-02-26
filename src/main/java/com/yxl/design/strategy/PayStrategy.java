package com.yxl.design.strategy;

import java.math.BigDecimal;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/26 15:19
 */
public interface PayStrategy {

    /**
     * 支付 统一下单接口
     * @param orderId
     * @param price
     */
    void unifiedOrder(Integer orderId, BigDecimal price);


    /**
     * 退款接口
     * @param orderId
     * @return
     */
    boolean refund(Integer orderId);


}
