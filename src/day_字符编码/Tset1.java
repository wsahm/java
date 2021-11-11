package day_字符编码;

import java.io.*;

public class Tset1 {
    public static void main(String[] args) throws Exception {
        String s = "abc中文徵镕";
        String path = "e:/JAVA/abc/f6.txt";
        String charset = "gb2312";
        //f(s,path,charset);
        //path="e:/JAVA/abc/f7.txt";
        //charset="Unicode";
        //f(s,path,charset);
        f1(path, charset);
    }

    private static void f1(String path, String charset) throws Exception {
        InputStreamReader in = new InputStreamReader(new FileInputStream(path), charset);
        int n;
        String s;
        while ((n = in.read()) != -1) {
            System.out.printf("%c\n", n);
        }
    }

    private static void f(String s, String path, String charset) throws Exception {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), charset);
        out.write(s);
        out.close();
    }
}
