package com.yxl.design.decorator;

public class CoffeeBar {
    public static void main(String[] args) {

        //1。点一份 logBlack
        Drink order = new LongBlack();
        System.out.println("费用1  ……   " + order.cost());
        System.out.println("描述" + order.getDes());

        //2. 加入一份牛奶
        order = new Milk(order);
        System.out.println("加入牛奶过后的费用" + order.cost());
        System.out.println("描述" + order.getDes());

        //3. 加入一份巧克力
        order = new Chocolate(order);

        System.out.println("加入牛奶 + 巧克力 过后的费用" + order.cost());
        System.out.println("描述" + order.getDes());
    }
}
