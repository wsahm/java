package day_web服务器.cn.tedu1.core;

import day_web服务器.cn.tedu1.http.Sever;
import jdk.nashorn.internal.objects.Global;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class ClientHendler1 implements Runnable{
    private Socket s;

    public ClientHendler1(Socket s){
        this.s=s;
    }
    @Override
    public void run() {
        PrintStream p = null;
        try {
//            System.out.println(request.getQueryString());
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpServletResponse response=ServletActionContext.getResponse();
            Sever s = new Sever();
            s.doPost(request,response);
            p= new PrintStream(this.s.getOutputStream());
            //向浏览器发送信息时需要遵守的约定
            p.println("HTTP/1.1 200 OK");
            p.println("Content-Type:text/html");
            String data = "Hello Word....";
            p.println("Content-Length:" + data.length());
            p.println();
            p.write(data.getBytes());
            p.flush();
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        } finally {
            p.close();
        }
    }
}
