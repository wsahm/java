package day_File;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入文件夹：");
        String s = new Scanner(System.in).nextLine();
        File f = new File(s);
        if (!f.isDirectory()) {
            System.out.println("不是文件夹");
        }
        fun(f);
    }

    private static void fun(File f) {
        File[] f1 = f.listFiles();
        String[] s = f.list();
        if (f1 == null) {
            return;
        }
        for (int i = 0; i < s.length; i++) {
            if (f1[i].isFile()) {
                if (s[i].endsWith("jpg")) {
                    System.out.println(f1[i].getAbsolutePath());
                }
            } else {
                fun(f1[i]);
            }
        }
    }
}
