package com.yxl.design.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/11 21:53
 */
public class BasicFileChannel2 {

    public static void main(String[] args) throws IOException {
        //读取文件创建输入流
        File file = new File("/Users/yanxiaolong/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();

        //创建缓存区Buffer
        ByteBuffer allocate = ByteBuffer.allocate((int)file.length());

        channel.read(allocate);
        System.out.println(new String(allocate.array()));

        fileInputStream.close();
    }
}
