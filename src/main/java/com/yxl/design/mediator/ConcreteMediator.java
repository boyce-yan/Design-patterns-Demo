package com.yxl.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/23 17:44
 */
public class ConcreteMediator extends Mediator{

    /**
     * 集合
     */
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    public ConcreteMediator(String name) {
        super(name);
    }


    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague, String message) {
        for (Colleague ob : colleagues) {
            if(ob != colleague){
                System.out.println("中介转发");
                ob.notify(message);
            }

        }
    }



}
