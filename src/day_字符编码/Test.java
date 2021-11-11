package day_字符编码;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        String a = "abc中文镕";
        System.out.println(a);
        f(a, "null");
        f(a, "GBK");
        f(a, "GB2312");
        f(a, "UTF-8");
    }

    private static void f(String a, String charset) throws Exception {
        byte[] bt;
        String s;
        if (charset.equals("null")) {
            bt = a.getBytes();
            s = new String(bt);
        } else {
            bt = a.getBytes(charset);
            s = new String(bt, charset);
        }
        System.out.println(charset + "\t" + Arrays.toString(bt) + "," + s);

    }
}
