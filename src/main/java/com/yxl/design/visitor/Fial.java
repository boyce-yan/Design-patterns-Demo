package com.yxl.design.visitor;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:23
 */
public class Fial extends Action{
    @Override
    public void getManReslt(Man man) {
        System.out.printf("男人"+man.getName()+"对该歌手评价是很失败");
    }

    @Override
    public void getWomanReslt(Woman woman) {
        System.out.printf("女人"+woman.getName()+"对该歌手评价是很失败");
    }
}
