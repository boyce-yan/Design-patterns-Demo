package com.yxl.design.io.nio;

import java.nio.IntBuffer;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/10 20:31
 */
public class BasicBuffer {

    public static void main(String[] args) {
        //创建一个IntBuffer 大小为5
        IntBuffer intBuffer = IntBuffer.allocate(5);
        intBuffer.put(1);
        intBuffer.put(2);
        intBuffer.put(3);
        intBuffer.put(4);
        intBuffer.put(45);
        //读写转换
        intBuffer.flip();
        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }

    }
}
