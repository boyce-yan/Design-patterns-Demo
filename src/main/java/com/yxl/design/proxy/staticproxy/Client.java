package com.yxl.design.proxy.staticproxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:19
 */
public class Client {

    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
