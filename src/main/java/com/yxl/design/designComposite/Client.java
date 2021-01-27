package com.yxl.design.designComposite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/1/21 下午10:07
 */
public class Client {

    public static void main(String[] args) {
        //从大到小建立大学
        University university = new University("清华", "985");

        //创建学院
        College college = new College("计算机学院", "计算机学院");
        College college2 = new College("信息工程学院", "信息工程学院");

        //添加专业
        college.add(new Department("计算机科学与技术","计算机科学与技术"));
        college.add(new Department("网络工程","网络工程"));

        college2.add(new Department("通信工程","通信工程"));
        college2.add(new Department("信息工程","通信工程"));


        university.add(college);
        university.add(college2);
        university.print();
    }
}
