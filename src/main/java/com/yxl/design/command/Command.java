package com.yxl.design.command;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/9 下午12:19
 */
public interface Command {

    /**
     * 执行动作
     */
    public void execute();

    /**
     * 撤销动作
     */
    public void undo();
}
