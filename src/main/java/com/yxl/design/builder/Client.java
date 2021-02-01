package com.yxl.design.builder;

public class Client {
    public static void main(String[] args) {
        //普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

        HignBuilding hignBuilding = new HignBuilding();
        HouseDirector houseDirector2 = new HouseDirector(hignBuilding);
        houseDirector2.constructHouse();
        }
}
