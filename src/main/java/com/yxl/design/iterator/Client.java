package com.yxl.design.iterator;


import java.util.Iterator;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/19 22:28
 */
public class Client {

    public static void main(String[] args) {
        College college = new InfoCollege();
        college.addDepartment("11","11");
        college.addDepartment("22","22");
        Iterator it = college.createIterator();
        while (it.hasNext()) {

            System.out.println( it.next());
        }

    }
}

