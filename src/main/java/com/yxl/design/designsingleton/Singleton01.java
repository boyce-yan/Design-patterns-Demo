package com.yxl.design.designsingleton;

//饿汉
public class Singleton01 {

    private static Singleton01 singleton =new Singleton01();

    private Singleton01(){

    }

    public static Singleton01 getInstance(){
        return singleton;
    }

}
