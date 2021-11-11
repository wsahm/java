package day_网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.102", 8000);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        out.write("Hello".getBytes());
        out.flush();
        for (int i = 0; i < 5; i++) {
            char c = (char) in.read();
            System.out.print(c);
        }
        s.close();
    }
}
