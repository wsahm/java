package day_字符编码;

import java.io.*;

public class copy1 {
    public static void main(String[] args) {
//        String s="a中文";
//        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("E:/JAVA/abc/f.txt"),"GBK");
//        out.write(s);
//        out.close();
        try {
            copy();
            System.out.println("成功");
        } catch (IOException e) {
            System.out.println("失败");
            e.printStackTrace();
        }

    }

    private static void copy() throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream("E:/JAVA/abc/f.txt"), "GBK");
        OutputStreamWriter out1 = new OutputStreamWriter(new FileOutputStream("E:/JAVA/abc/f2.txt"), "UTF-8");
        int n;
        while ((n = in.read()) != -1) {
            out1.write(n);
        }
        out1.close();
        in.close();
    }
}
