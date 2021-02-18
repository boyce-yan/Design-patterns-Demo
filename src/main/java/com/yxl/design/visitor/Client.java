package com.yxl.design.visitor;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:37
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("大家"));
        objectStructure.attach(new Woman("李芳"));

        Success success = new Success();
        objectStructure.display(success);
        System.out.printf("\n");

        Fial fial = new Fial();
        objectStructure.display(fial);
    }
}
