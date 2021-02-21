package com.yxl.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/19 22:05
 */
public class InfoCollege implements College{


    List<Department> departmentList;

    int numOfDepartment = 0;


    public InfoCollege() {
        departmentList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
