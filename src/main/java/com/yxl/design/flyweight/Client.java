package com.yxl.design.flyweight;

import org.springframework.context.support.AbstractRefreshableApplicationContext;

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

        int abc = 120;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(abc));
        StringBuffer reverse = stringBuffer.reverse();

        String newStr = reverse.toString().replaceAll("^(0+)", "");

        Integer.parseInt(newStr);
        System.out.println(newStr);


    }



}
