package day_web服务器.cn.tedu1.core;

import day_web服务器.cn.tedu1.http.Sever;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {
    private ServerSocket ss;
    private ExecutorService e;
    public WebServer(){
        try {
            ss=new ServerSocket(8080);
            e= Executors.newFixedThreadPool(50);
            System.out.println("服务已启动.....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        while(true) {
            try {
                Socket s = ss.accept();
                HttpServletRequest request = ServletActionContext.getRequest();
                HttpServletResponse response=ServletActionContext.getResponse();
                Sever s1 = new Sever();
                s1.doPost(request,response);
                PrintStream p = new PrintStream(s.getOutputStream());
                //向浏览器发送信息时需要遵守的约定
                p.println("HTTP/1.1 200 OK");
                p.println("Content-Type:text/html");
                String data = "Hello Word....";
                p.println("Content-Length:" + data.length());
                p.println();
                p.write(data.getBytes());
                p.flush();
                p.close();
//                e.execute(new ClientHendler1(s));
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        WebServer ws=new WebServer();
        ws.start();
    }
}
