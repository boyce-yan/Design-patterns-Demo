package com.yxl.design.io.nio;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/13 15:56
 */
public class NIOServer {

    public static void main(String[] args) throws IOException {
        //创建ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        //创建选择器
        Selector selector = Selector.open();

        serverSocketChannel.bind(new InetSocketAddress(6666));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);
        //循环等待客户端连接
        while (true){
            if(selector.select(1000) == 0){
                System.out.println("服务器等待了一秒 无连接");
                continue;
            }
            //如果大于0就获取相关的selectedKeys连接，已经获取到关注到事件
            //selector.selectedKeys(); 返回事件的集合
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                //获取下一个元素
                SelectionKey next = iterator.next();
                //如果是OP_ACCEPT，有新的客户端连接
                if(next.isAcceptable()){
                    //该客户端生成一个SocketChannel
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    System.out.println("客户端连接成功 生成一个 socketChannel" + socketChannel.hashCode());
                    //注册，关联ByteBuffer
                    socketChannel.register(selector,SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }
                //发送OP_READ
                if(next.isReadable()){
                    SocketChannel socketChannel = (SocketChannel) next.channel();
                    ByteBuffer byteBuffer =  (ByteBuffer) next.attachment();
                    socketChannel.read(byteBuffer);
                    System.out.println("from 客户端：" + new String(byteBuffer.array()));
                }
                iterator.remove();
            }


        }
    }


}
