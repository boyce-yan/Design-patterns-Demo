package com.yxl.design.designadapter;

public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){
            System.out.println("电压 5 V 可以充电");
        }else{
            System.out.println("不能充电");
        }
    }
}
