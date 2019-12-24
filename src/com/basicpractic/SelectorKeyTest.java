package com.basicpractic;

import com.sun.javafx.scene.control.SelectedCellsMap;
import com.sun.javafx.stage.WindowCloseRequestHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Selector;


/**
 * @program: SelectorKeyTest
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/29
 */
public class SelectorKeyTest extends Thread{
    private static ServerSocket serverSocket;

    public int getPort(){
        return serverSocket.getLocalPort();
    }

    public void run(){
        try{
            //绑定端口0
            serverSocket = new ServerSocket(0);
            //等待客户端连接
            while (true){
                Socket socket = serverSocket.accept();
                RequestHandler requestHandler = new RequestHandler(socket);
                requestHandler.start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (serverSocket != null){
                try{
                    serverSocket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{

        SelectorKeyTest selectorKeyTest = new SelectorKeyTest();
        selectorKeyTest.start();
        //模拟客户端
        try (Socket client = new Socket(InetAddress.getLocalHost(), serverSocket.getLocalPort())){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bufferedReader.lines().forEach(s -> System.out.println(s));
        }

    }
    //只发不读
    class RequestHandler extends Thread{
        private Socket socket;
        RequestHandler(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run(){
            try(PrintWriter out = new PrintWriter(socket.getOutputStream());){
                out.println("hello world");
                out.flush();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
