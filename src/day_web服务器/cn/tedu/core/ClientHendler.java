package day_web服务器.cn.tedu.core;

import day_动态编程.Runner;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;

public class ClientHendler implements Runnable {
    private Socket socket;

    public ClientHendler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = br.readLine();
//            int i = s.indexOf("/", 0);
//            int i1 = s.indexOf(" ", i+1);
//            String s1 = s.substring(i+1, i1);
            String[] s1 = s.split(" ");
            if (s1[1].equals("/")) {
                s1[1] = "/index.html";
            }
//            if(!s1[1].equals("/favicon.ico")){
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html");
//            String data="hfdhdf";
//            ps.println("Content-Length"+data.getBytes().length);
            String path = Runner.class.getResource("/HTML" + s1[1]).getPath();//获得index的路径
            path = URLDecoder.decode(path, "utf-8");
            File f = new File(path);
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
            byte[] b = new byte[(int) f.length()];
            bis.read(b);
            ps.println();
//            ps.write(data.getBytes());
            ps.write(b);
            ps.flush();
            ps.close();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
