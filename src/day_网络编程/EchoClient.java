package day_网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public void start() {
        try {
            System.out.print("请输入需要连接的IP:");
            String s = new Scanner(System.in).nextLine();
            System.out.print("请输入端口号：");
            int a = new Scanner(System.in).nextInt();
            Socket sc = new Socket(s, a);
            BufferedReader in = new BufferedReader(new InputStreamReader(sc.getInputStream(), "GBK"));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(sc.getOutputStream(), "GBK"));
            while (true) {
                System.out.print("请输入发送的信息（exit）:");
                String str = new Scanner(System.in).nextLine();
                if ("exit".equals(str)) {
                    sc.close();
                    break;
                }
                out.println(str);
                out.flush();
                String echo = in.readLine();
                System.out.println("回声数据：" + echo);
            }

        } catch (Exception e) {
        }
        System.out.println("与服务器断开连接");
    }

    public static void main(String[] args) {
        EchoClient e = new EchoClient();
        e.start();
    }
}
