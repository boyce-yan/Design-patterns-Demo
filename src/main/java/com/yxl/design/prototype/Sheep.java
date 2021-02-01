package com.yxl.design.prototype;

import lombok.Data;

@Data
public class Sheep implements Cloneable{
    //姓名
    private String name;
    //年龄
    private Integer age;
    //颜色
    private String color;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //克隆该实例，默认实用化clone方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep =(Sheep)super.clone();
        return sheep;
    }
}
