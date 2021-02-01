package com.yxl.design.template;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/31 下午1:34
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("---制作黑豆豆浆---");
        SoyaMilk soyaMilk = new BlackBeanSoyaMilk();
        soyaMilk.make();


        System.out.println("---制作花生豆浆---");
        SoyaMilk soyaMilk1 = new PeanutSoyaMilk();
        soyaMilk1.make();


        System.out.println("---制作豆浆---");
        SoyaMilk soyaMilk2 = new PureSoyaMilk();
        soyaMilk2.make();


    }
}
