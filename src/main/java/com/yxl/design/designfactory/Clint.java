package com.yxl.design.designfactory;

public class Clint {

    public static void main(String[] args) {
        Car byd = CarFactory.createCar("吉利");
        byd.run();

    }
}
