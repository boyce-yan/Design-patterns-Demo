package com.yxl.design.singleton;

//饿汉 静态代码块
public class Singleton02 {

    private static Singleton02 singleton ;

    static {
        singleton = new Singleton02();
    }
    private Singleton02(){

    }

    public static Singleton02 getInstance(){
        return singleton;
    }

}
