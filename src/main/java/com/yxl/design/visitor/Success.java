package com.yxl.design.visitor;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:21
 */
public class Success extends Action{
    @Override
    public void getManReslt(Man man) {
        System.out.printf("男人"+man.getName()+"对该歌手评价是很成功");
    }

    @Override
    public void getWomanReslt(Woman woman) {
        System.out.printf("女人"+woman.getName()+"对该歌手评价是很成功");
    }
}
