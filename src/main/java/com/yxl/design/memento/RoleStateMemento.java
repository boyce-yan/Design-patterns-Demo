package com.yxl.design.memento;

import lombok.Data;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 11:56
 */
@Data
public class RoleStateMemento {

    /**
     * 生命值
     */
    private Integer vit;

    /**
     * 体力
     */
    private Integer phy;

    /**
     * 攻击力
     */
    private Integer atk;

    public RoleStateMemento(Integer vit, Integer phy, Integer atk) {
        this.vit = vit;
        this.phy = phy;
        this.atk = atk;
    }
}
