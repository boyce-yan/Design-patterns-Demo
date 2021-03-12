package com.yxl.design.io.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/11 21:29
 */
public class BasicFileChannel {

    public static void main(String[] args) throws IOException {
        String str = "Hello World";
        //创建一个输出流Channel
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/yanxiaolong/a.txt");

        //拿到FileChannel
        FileChannel channel = fileOutputStream.getChannel();

        //创建缓存区Buffer
        ByteBuffer allocate = ByteBuffer.allocate(1034);
        allocate.put(str.getBytes(StandardCharsets.UTF_8));
        //对ByteBuffer进行flip
        allocate.flip();
        //将ByteBuffer写入FileChannel
        channel.write(allocate);

        //关闭流
        fileOutputStream.close();
    }
}
