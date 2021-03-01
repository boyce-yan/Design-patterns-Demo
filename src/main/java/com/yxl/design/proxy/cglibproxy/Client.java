package com.yxl.design.proxy.cglibproxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:26
 */
public class Client {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        IUserDao userDao = (IUserDao)cglibProxy.getInstance(new UserDaoImpl());
        userDao.save();
    }
}
