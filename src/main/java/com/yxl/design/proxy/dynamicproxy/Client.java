package com.yxl.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:23
 */
public class Client {

    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(userDao);
        ClassLoader classLoader = userDao.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();
        IUserDao newUserDao= (IUserDao) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        newUserDao.save();

    }
}
