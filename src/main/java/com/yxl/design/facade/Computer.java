package com.yxl.design.facade;

/**
 * 门面类
 */
public class Computer {

    AliSmsService aliSmsService;

    EamilSmsService eamilSmsService;

    WeiXinSmsService weiXinSmsService;

    public Computer() {
        aliSmsService = new AliSmsServiceImpl();
        eamilSmsService = new EamilSmsServiceImpl();
        weiXinSmsService = new WeixinSmsServiceImpl();
    }

    public void sendMsg(){
        aliSmsService.sendSms();
        eamilSmsService.sendSms();
        weiXinSmsService.sendSms();
    }
}
