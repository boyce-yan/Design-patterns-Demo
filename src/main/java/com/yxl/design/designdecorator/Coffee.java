package com.yxl.design.designdecorator;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
