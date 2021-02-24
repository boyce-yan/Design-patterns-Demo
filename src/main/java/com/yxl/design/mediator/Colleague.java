package com.yxl.design.mediator;

import lombok.Data;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/23 17:38
 */
@Data
public abstract class Colleague {

    protected Mediator mediator;



    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 通知
     * @param meaasge
     */
    public abstract void notify(String meaasge);

    /**
     * 发送
     * @param c1
     * @param message
     */
    public abstract void send(Colleague c1, String message);
}
