package com.yxl.design.composite;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/21 下午10:01
 */
public class Department extends OrganizationComponent{


    public Department(String name, String des) {
        super(name, des);

    }


    @Override
    protected void print() {
        System.out.println("------------"+getName()+"------------");
    }
}
