package com.yxl.design.strategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/26 15:19
 */
public class PayContext {

    PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void getPay(){
        payStrategy.unifiedOrder(new Random(10).nextInt(),new BigDecimal("1"));
    }

    public void getRefund(){
        payStrategy.refund(new Random(10).nextInt());
    }
}
