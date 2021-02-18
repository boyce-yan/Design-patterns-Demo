package com.yxl.design.visitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/18 16:31
 */
public class ObjectStructure {


    public List<Person> personList = new LinkedList<>();

    /**
     * 添加
     * @param person
     */
    public void attach(Person person){
        personList.add(person);
    }

    /**
     * 移除
     * @param person
     */
    public void detach(Person person){
        personList.remove(person);
    }

    /**
     * 显示测评情况
     * @param action
     */
    public void display(Action action){
        personList.stream().forEach(person -> {
            person.accept(action);
        });
    }
}
