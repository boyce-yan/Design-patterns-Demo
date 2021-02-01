package com.yxl.design.factory;

public class CarFactory {
    public static  Car createCar(String name){
        if(!name.isEmpty() && name=="比亚迪"){
            return new Byd();
        }
        if(!name.isEmpty() && name=="吉利"){
            return new Jl();
        }
        return null;
    }

}
