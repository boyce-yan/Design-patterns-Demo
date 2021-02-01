package com.yxl.design.decorator;

public class Decorator extends Drink{
    private Drink obj;

    @Override
    public float cost() {
        //自己价格
        return super.getPrice() + obj.cost();
    }

    public Decorator(Drink obj) {
        this.obj = obj;
    }


    @Override
    public String getDes() {
        return "" + super.getPrice() + "&&" + obj.getPrice();
    }
}
