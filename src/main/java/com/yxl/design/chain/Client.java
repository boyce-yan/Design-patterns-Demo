package com.yxl.design.chain;

import java.math.BigDecimal;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/28 20:46
 */
public class Client {

    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,new BigDecimal("3000"),1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张组长");
        PmApprover pmApprover = new PmApprover("张经理");
        MdApprover mdApprover = new MdApprover("李总监");
        GmApprover gmApprover = new GmApprover("李总经理");
        departmentApprover.setApprover(pmApprover);
        pmApprover.setApprover(mdApprover);
        mdApprover.setApprover(gmApprover);

        departmentApprover.processRequest(purchaseRequest);

    }
}
