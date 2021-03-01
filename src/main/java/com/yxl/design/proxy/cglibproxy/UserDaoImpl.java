package com.yxl.design.proxy.cglibproxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:25
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("已经保存数据...");
    }
}
