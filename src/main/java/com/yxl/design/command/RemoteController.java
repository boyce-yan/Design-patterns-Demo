package com.yxl.design.command;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/9 下午1:31
 */
public class RemoteController {

    Command[] onCommands;

    Command[] offCommands;

    Command undoCommond;

    public RemoteController() {
        onCommands =new Command[5];
        offCommands =new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new Nocommand();
            offCommands[i] = new Nocommand();
        }
    }

    /**
     * 设置成命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }


    /**
     * 按下开机按钮
     * @param no
     */
    public void onButtonWasPushed(int no){
        //执行
        onCommands[no].execute();
        //记录操作用于撤销
        undoCommond = onCommands[no];
    }

    /**
     * 按下关机按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        //执行
        offCommands[no].execute();
        //记录操作用于撤销
        undoCommond = offCommands[no];
    }

    /**
     * 按下关机按钮
     * @param no
     */
    public void undoButtonWasPushed(int no){
        undoCommond.undo();
    }
}
