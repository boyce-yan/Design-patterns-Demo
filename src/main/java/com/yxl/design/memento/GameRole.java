package com.yxl.design.memento;

import lombok.Data;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 11:37
 */
@Data
public class GameRole {

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

    //获取状态
    public void getState() {
        System.out.println("游戏角色当前状态：");
        System.out.println("生命值： " + this.vit);
        System.out.println("体力：" + this.phy);
        System.out.println("攻击力：" + this.atk);
        System.out.println("-----------------");
    }

    /**
     * 初始化生命值
     */
    public GameRole() {
        this.vit = 100;
        this.atk = 100;
        this.phy = 100;
    }

    /**
     * 战斗后
     * @param vit
     * @param atk
     * @param phy
     */
    public void fightAfter(Integer vit,Integer atk,Integer phy) {
        this.phy = this.phy == null || this.phy == 0 ? 100 - phy : this.vit - phy;
        this.vit = this.vit == null || this.vit == 0 ? 100 - vit : this.vit - vit;
        this.atk = this.atk == null || this.atk == 0 ? 100 - atk : this.atk - atk;
    }


    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento saveState() {
        return (new RoleStateMemento(vit, atk, phy));
    }

    /**
     * 恢复角色状态
     * @param memento
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.phy = memento.getPhy();
    }


}
