package com.yxl.design.interpreter;

import java.util.HashMap;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/24 16:16
 */
public abstract class Expression {

    /**
     * 解析公式和数值
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
