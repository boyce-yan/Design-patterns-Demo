package com.yxl.design.visitor;

import lombok.Data;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:19
 */
@Data
public class Man extends Person{

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void accept(Action action) {
        action.getManReslt(this);
    }
}
