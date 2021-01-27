package com.yxl.design.designflyweight;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/26 下午10:28
 */
public class Client {

    public static void main(String[] args) {

        //创建工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要分布新闻
        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use();

        //客户要分布新闻
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use();
    }
}
