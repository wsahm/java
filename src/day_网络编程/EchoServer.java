package day_网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public void start() {
        new Thread() {
            @Override
            public void run() {
                try {
                    ServerSocket ss = new ServerSocket(8000);
                    System.out.println("服务器启动");
                    while (true) {
                        Socket s = ss.accept();
                        TongXinThread tx = new TongXinThread(s);
                        tx.start();
                    }

                } catch (Exception e) {

                }
            }
        }.start();
    }

    public class TongXinThread extends Thread {
        private Socket s;

        public TongXinThread(Socket s) {
            this.s = s;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(), "GBK"));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "GBK"));
                String line;
                while ((line = in.readLine()) != null) {
                    out.println(line);
                    out.flush();
                    System.out.println(line);
                }

            } catch (Exception e) {
            }
            System.out.println(s.getLocalSocketAddress() + "断开连接");
        }
    }

    public static void main(String[] args) {
        EchoServer e = new EchoServer();
        e.start();
    }
}
