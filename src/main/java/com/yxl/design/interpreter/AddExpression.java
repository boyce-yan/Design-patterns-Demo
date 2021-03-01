package com.yxl.design.interpreter;

import java.util.HashMap;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 16:20
 */
public class AddExpression extends SymbolExpression{


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }


    @Override
    public int interpreter(HashMap<String, Integer> var) {
         return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
