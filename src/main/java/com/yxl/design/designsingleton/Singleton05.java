package com.yxl.design.designsingleton;

//懒汉 安全的 同步代码块
public class Singleton05 {

    private static Singleton05 singleton ;

    private Singleton05(){

    }

    public static  Singleton05 getInstance(){
        if (singleton== null) {
            synchronized(Singleton05.class){
                singleton =new Singleton05();
            }
        }
        return singleton;
    }

}
