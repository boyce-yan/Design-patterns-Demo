package com.yxl.design.designsingleton;

//双重检查
public class Singleton06 {

    private static volatile Singleton06 singleton ;

    private Singleton06(){

    }

    public static Singleton06 getInstance(){
        if (singleton== null) {
            synchronized(Singleton06.class){
                if (singleton== null) {
                    singleton = new Singleton06();
                }
            }
        }
        return singleton;
    }

}
