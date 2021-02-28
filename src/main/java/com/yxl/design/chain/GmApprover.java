package com.yxl.design.chain;

import java.math.BigDecimal;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/28 20:40
 */
public class GmApprover extends Approver{

    public GmApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice().compareTo(new BigDecimal("30000.00"))==1){
            System.out.println("当前ID"+purchaseRequest.getId()+"被"+this.name+"处理");
        }
    }
}
