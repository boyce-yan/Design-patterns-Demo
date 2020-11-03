package com.yxl.design.designbuilder;

import lombok.Data;

public abstract class HouseBuilder {

    protected House house = new House();

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    //建造房子
    public House buildHouse() {
        return house;
    }
}
