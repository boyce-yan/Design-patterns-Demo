package com.yxl.design.command;

/**
 * 没有任何命令空执行：用于初始化每个按钮
 * @author yxl
 * @version 1.0
 * @date 2021/2/9 下午1:19
 */
public class Nocommand implements Command{

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
