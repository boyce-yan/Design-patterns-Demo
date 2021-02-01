package com.yxl.design.template;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/31 下午2:00
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("不加东西");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
