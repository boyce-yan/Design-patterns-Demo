package com.yxl.design.template;

/**
 * 抽象类表示豆浆
 * @author yxl
 * @version 1.0
 * @date 2021/1/31 下午1:33
 */
public abstract class SoyaMilk {

    /**
     * 模版方法 final不让子类覆盖
     */
    final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    /**
     * 选材料
     */
    private void select(){
        System.out.println("第一步：选择好的新鲜的豆浆");
    }

    /**
     * 添加不同的材料
     */
    abstract void addCondiments();


    /**
     * 浸泡
     */
    private void soak(){
        System.out.println("第三部，开始浸泡");
    }

    /**
     * 放到豆浆机
     */
    private void beat(){
        System.out.println("第四步：放到豆浆机");
    }


    /**
     * 钩子方法
     */
    boolean customerWantCondiments(){
        return true;
    }


}
