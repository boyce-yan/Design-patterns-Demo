package com.yxl.design.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/3/9 20:18
 */
public class BIOServer {
    public static void main(String[] args) throws IOException {

        //1.创建一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("服务器启动了");
        while(true){
            Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");
            //创建线程池与之
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    handler(socket);
                }
            });
        }
    }

    public static void handler(Socket socket){
        try {
            System.out.println("当前线程ID"+ Thread.currentThread().getId() + "名称" + Thread.currentThread().getName());
            byte[] bytes = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            while (true){
                int read = inputStream.read();
                if(read != -1){
                    System.out.println("-");
                    System.out.println(new String(bytes,0,read));
                }else{
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("关闭客户端的连接");
        }

    }
}
