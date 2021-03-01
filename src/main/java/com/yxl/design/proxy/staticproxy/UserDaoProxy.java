package com.yxl.design.proxy.staticproxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:19
 */
public class UserDaoProxy implements IUserDao{

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("开启事物...");
        userDao.save();
        System.out.println("关闭事物...");
    }

}
