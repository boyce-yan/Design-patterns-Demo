package com.yxl.design.composite;

import lombok.Data;
import lombok.ToString;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/21 下午9:29
 */
@Data
@ToString
public abstract class OrganizationComponent {

    /**
     * 说明
     */
    private String name;

    /**
     * 说明
     */
    private String des;


    /**
     * 添加方法
     * @param component
     */
    protected void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    /**
     * 删除
     * @param component
     */
    protected void remove(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }
}
