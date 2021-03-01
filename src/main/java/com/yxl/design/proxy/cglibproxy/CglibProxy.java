package com.yxl.design.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/1 11:24
 */
public class CglibProxy implements MethodInterceptor {
    private Object obj;


    public Object getInstance(Object obj) {
        this.obj = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB 动态代理 -- 开启事物");
        Object result = method.invoke(obj, objects);
        System.out.println("CGLIB 动态代理 -- 提交事物");
        return result;
    }

}
