package com.yxl.design.proxy.dynamicproxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:22
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("已经保存数据...");
    }
}
