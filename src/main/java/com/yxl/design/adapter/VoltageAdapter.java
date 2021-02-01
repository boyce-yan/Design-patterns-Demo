package com.yxl.design.adapter;

public class VoltageAdapter implements IVoltage5V{

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(voltage220V != null){
            int src = voltage220V.output220v();//获取220v 电压
            System.out.println("使用对象适配器～～～");
            dst = src / 44;
            System.out.println("输出的电压"+ dst);
        }
        return dst;
    }
}
