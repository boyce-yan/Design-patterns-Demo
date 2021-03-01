package com.yxl.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:21
 */
public class InvocationHandlerImpl implements InvocationHandler {
    // 每次生成动态代理类对象时,实现了InvocationHandler接口的调用处理器对象

    // 这其实业务实现类对象，用来调用具体的业务方法
    private Object target;


    public InvocationHandlerImpl(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("动态代理 -- 开启事物");
        result = method.invoke(target, args);
        System.out.println("动态代理 -- 提交事物");
        return result;
    }

}
