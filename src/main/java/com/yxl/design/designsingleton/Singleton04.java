package com.yxl.design.designsingleton;

//懒汉 安全的
public class Singleton04 {

    private static Singleton04 singleton ;

    private Singleton04(){

    }

    public static synchronized Singleton04 getInstance(){
        if (singleton== null) {
            singleton =new Singleton04();
        }
        return singleton;
    }

}
