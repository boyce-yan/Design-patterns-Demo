package com.yxl.design.iterator;

import java.util.Iterator;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/19 21:45
 */
public interface College {

    /**
     * 获取名称
     * @return
     */
    public String getName();

    /**
     * 添加院系
     * @param name
     * @param desc
     */
    public void addDepartment(String name,String desc);

    /**
     * 遍历
     * @return
     */
    public Iterator createIterator();

}
