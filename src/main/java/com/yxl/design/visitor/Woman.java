package com.yxl.design.visitor;

import lombok.Data;

/**
 * 这里使用了双分配
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:19
 */
@Data
public class Woman extends Person{

    private String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void accept(Action action) {
        action.getWomanReslt(this);
    }
}
