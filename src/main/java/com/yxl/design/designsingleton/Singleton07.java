package com.yxl.design.designsingleton;

//静态内部类
public class Singleton07 {

    private Singleton07(){
    }


    private static class SingletonInstace{
        private static Singleton07 singleton07 =new Singleton07();
    }

    public static Singleton07 getInstance(){
        return SingletonInstace.singleton07;
    }

}
