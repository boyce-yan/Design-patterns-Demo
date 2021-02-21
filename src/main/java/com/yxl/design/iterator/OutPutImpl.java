package com.yxl.design.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/19 22:18
 */
public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }


    public void printCollege(){
        //java中的List已经实现Iterator接口
        Iterator<College> iterator = collegeList.iterator();
    }


    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department =(Department)iterator.next();
        }
    }
}
