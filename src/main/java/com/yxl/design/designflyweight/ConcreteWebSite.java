package com.yxl.design.designflyweight;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/26 下午10:20
 */
public class ConcreteWebSite extends WebSite{

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站发布形式为 ：" + type);
    }
}
