package com.yxl.design.memento;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 11:57
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
