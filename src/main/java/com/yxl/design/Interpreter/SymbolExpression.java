package com.yxl.design.Interpreter;

import java.util.HashMap;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 16:19
 */
public class SymbolExpression extends Expression{

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
