package com.yxl.design.chain;

import lombok.Data;
import lombok.ToString;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/28 20:23
 */

public abstract class Approver {

    /**
     * 下一个处理者
     */
    Approver approver;

    /**
     * 名称
     */
    String name;

    public Approver() {
    }

    public Approver(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批的方法
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
