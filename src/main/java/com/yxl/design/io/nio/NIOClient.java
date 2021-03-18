package com.yxl.design.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/15 21:48
 */
public class NIOClient {
    public static void main(String[] args) throws IOException {
        //得到网络通道
        SocketChannel socketChannel = SocketChannel.open();
        //设置非阻塞
        socketChannel.configureBlocking(false);
        //socket连接地址
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 6666);
        //连接服务器
        if(!socketChannel.connect(inetSocketAddress)){
            while(!socketChannel.finishConnect()){
                System.out.println("因为连接需要时间，客户端不会阻塞，可以做其他工作");
            }
        }

        //连接成功就发送数据
        String str = "hello world";

        ByteBuffer byteBuffer = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        //发送数据 将Buffer 数据写入Channel
        socketChannel.write(byteBuffer);
        System.in.read();


    }
}
