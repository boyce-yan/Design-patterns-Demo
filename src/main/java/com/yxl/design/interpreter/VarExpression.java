package com.yxl.design.interpreter;

import java.util.HashMap;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 16:16
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
