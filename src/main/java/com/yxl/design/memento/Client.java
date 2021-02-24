package com.yxl.design.memento;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 12:00
 */
public class Client {

    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.getState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());
        gameRole.fightAfter(1,1,1);
        gameRole.getState();
        //恢复状态
        gameRole.recoveryState(caretaker.getMemento());
        gameRole.getState();
        gameRole.fightAfter(5,5,5);
        gameRole.getState();
        //恢复状态
        gameRole.recoveryState(caretaker.getMemento());
        gameRole.getState();
    }
}
