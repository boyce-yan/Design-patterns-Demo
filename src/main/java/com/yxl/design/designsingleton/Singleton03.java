package com.yxl.design.designsingleton;

//懒汉 线程不安全
public class Singleton03 {

    private static Singleton03 singleton ;

    private Singleton03(){

    }

    public static Singleton03 getInstance(){
        if (singleton== null) {
            singleton =new Singleton03();
        }
        return singleton;
    }

}
