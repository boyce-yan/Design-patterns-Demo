package com.yxl.design.designadapter;

public class Client {
    //使用
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}
