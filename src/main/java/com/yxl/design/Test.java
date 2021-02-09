package com.yxl.design;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/1 上午11:39
 */
public class Test {

    public static void main(String[] args) {
        reverse(-123);
    }

     static int reverse(int x) {
        int n = 0;

         while(x!=0){
             n = n*10 + x%10;
             x = x/10;
         }
         System.out.println(n);
            return n;
    }
}
