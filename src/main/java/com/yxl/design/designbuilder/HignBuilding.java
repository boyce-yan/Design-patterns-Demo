package com.yxl.design.designbuilder;

public class HignBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼地基100m");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙100m");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶100m");
    }
}
