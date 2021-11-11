package day_File;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入文件夹：");
        String s = new Scanner(System.in).nextLine();
        File f = new File(s);
        if (!f.isDirectory()) {
            System.out.println("不是文件夹");
        }
        List<File> file = fun(f);
        Iterator it = file.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static List<File> fun(File f) {
        List<File> l = new ArrayList<File>();
        fun(f, l);
        return l;
    }

    private static void fun(File f, List<File> l) {
        if (f == null) {
            return;
        }
        File[] file = f.listFiles();

        for (File f1 : file) {
            if (f1.isFile()) {
                if (f1.getName().toLowerCase().matches(".+\\.(jpg|png)")) {
                    l.add(f1);
                }
            } else {
                fun(f1, l);
            }
        }

    }
}
