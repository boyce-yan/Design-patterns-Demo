package com.yxl.design.facade;

public class AliSmsServiceImpl implements AliSmsService{
    @Override
    public void sendSms() {
        System.out.println("发送阿里短信");
    }
}
