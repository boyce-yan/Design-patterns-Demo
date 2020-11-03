package com.yxl.design.designbuilder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("打地基5m。。。。");
    }

    @Override
    public void buildWalls() {
        System.out.println("砌墙5m。。。。");
    }

    @Override
    public void roofed() {
        System.out.println("封顶5m。。。。");
    }
}
