package day_web服务器.cn.tedu.core;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    private ServerSocket s;
    private ExecutorService pool;

    public WebServer() {
        try {
            s = new ServerSocket(8080);
            pool = Executors.newFixedThreadPool(100);
            System.out.println("服务器已启动");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                Socket socket = s.accept();
//                PrintStream ps=new PrintStream(socket.getOutputStream());
//                ps.println("HTTP/1.1 200 OK");//状态行
//                ps.println("Content-Type:text/html");//Content-Type响应头
//                String data="hello Server!!!";
//                ps.println("Content-length:"+data.length());//Content-length响应头
//                ps.println("");//空白行
//                //响应实体内容
//                ps.write(data.getBytes());
//                ps.flush();
//                ps.close();
                pool.execute(new ClientHendler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WebServer ws = new WebServer();
        ws.start();
    }
}
