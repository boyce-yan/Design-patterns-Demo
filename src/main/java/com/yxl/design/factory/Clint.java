package com.yxl.design.factory;

public class Clint {

    public static void main(String[] args) {
        Car byd = CarFactory.createCar("吉利");
        byd.run();

    }
}
