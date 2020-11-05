package com.yxl.design.designbridge;

public class Client {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Xiaomi());
        phone.open();
        phone.call();


        System.out.println("-=============================-");

        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
    }
}
