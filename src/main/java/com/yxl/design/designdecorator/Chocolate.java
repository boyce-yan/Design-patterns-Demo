package com.yxl.design.designdecorator;

public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f);
    }
}
