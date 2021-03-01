package com.yxl.design.bridge;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }


    @Override
    public void open(){
        super.open();
        System.out.println(" 直立式手机 ");
    }


    @Override
    public void close(){
        super.close();
        System.out.println(" 直立式手机 ");
    }

    @Override
    public void call(){
        super.call();
        System.out.println(" 直立式手机 ");
    }
}
