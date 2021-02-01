package com.yxl.design.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep =new Sheep("tom",1,"白色");
        Sheep sheep2= (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep2);

    }
}
