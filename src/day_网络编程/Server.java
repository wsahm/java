package day_网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8000);
        System.out.println("服务器启动");
        Socket s = ss.accept();
        System.out.println("客户端连接");
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        for (int i = 0; i < 5; i++) {
            char c = (char) in.read();
            System.out.print(c);
        }
        out.write("World".getBytes());
        out.flush();
        s.close();
        ss.close();
    }
}
