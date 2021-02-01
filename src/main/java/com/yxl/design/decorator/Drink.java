package com.yxl.design.decorator;

import lombok.Data;

@Data
public abstract class Drink {

    private String des;
    private float price = 0.0f;

    //子类实现
    public abstract float cost();

}
