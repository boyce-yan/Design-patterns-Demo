package com.yxl.design.designflyweight;

import java.util.HashMap;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/26 下午10:22
 */
public class WebSiteFactory {

    /**
     * 池
     */
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据类型，返回一个网站，如果没有就创建，并且放入到池中
     */
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    /**
     * 获取池中网站分类总数
     */
    public int getWebSiteCount(){
        return pool.size();
    }


}
