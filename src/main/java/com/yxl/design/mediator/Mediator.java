package com.yxl.design.mediator;

import lombok.Data;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/23 17:32
 */
@Data
public abstract class Mediator {

    private String name;

    public Mediator(String name) {
        this.name = name;
    }

    /**
     * 注册
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param colleague
     * @param message
     */
    public abstract void relay(Colleague colleague, String message);
}
