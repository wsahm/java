package day_File;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("请输入文件夹：");
        String s = new Scanner(System.in).nextLine();
        File f = new File(s);
        if (!f.isDirectory()) {
            System.out.println("不是文件夹");
            return;
        }
        long size = fun(f);
        System.out.println(size);
    }

    private static long fun(File f) {
        File[] f1 = f.listFiles();
        if (f1 == null) {
            return 0;
        }
        long sum = 0;
        for (File file : f1) {
            if (file.isFile()) {
                sum += file.length();
            } else {
                sum += fun(file);
            }
        }
        return sum;
    }
}
