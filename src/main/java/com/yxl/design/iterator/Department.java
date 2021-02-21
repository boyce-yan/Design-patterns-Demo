package com.yxl.design.iterator;

import lombok.Data;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/19 20:38
 */
@Data
public class Department {


    private String name;

    private String desc;


    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
