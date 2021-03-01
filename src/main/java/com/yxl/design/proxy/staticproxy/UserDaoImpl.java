package com.yxl.design.proxy.staticproxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:18
 */
public class UserDaoImpl implements IUserDao{

    @Override
    public void save() {
        System.out.println("已经保存数据...");
    }
}
