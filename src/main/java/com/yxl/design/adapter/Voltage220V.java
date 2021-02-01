package com.yxl.design.adapter;

//被适配的类
public class Voltage220V {

    public int output220v(){
        int src = 220;
        System.out.println("输出电压"+src+"伏");
        return src;
    }
}
