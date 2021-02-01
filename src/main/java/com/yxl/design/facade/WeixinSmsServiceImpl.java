package com.yxl.design.facade;

public class WeixinSmsServiceImpl implements WeiXinSmsService{
    @Override
    public void sendSms() {
        System.out.println("发送微信消息");
    }
}
