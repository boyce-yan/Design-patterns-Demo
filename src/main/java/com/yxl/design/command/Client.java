package com.yxl.design.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/9 下午12:18
 */
public class Client {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOncommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffcommand = new LightOffCommand(lightReceiver);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOncommand,lightOffcommand);
        System.out.println("按下灯的开按钮");
        remoteController.onButtonWasPushed(0);
        System.out.println("按下灯的关按钮");
        remoteController.offButtonWasPushed(0);
        System.out.println("按下灯撤销按钮");
        remoteController.undoButtonWasPushed(0);
    }
}
