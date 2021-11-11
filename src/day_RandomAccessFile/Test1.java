package day_RandomAccessFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入路径:");
        String s = new Scanner(System.in).nextLine();
        File file = new File(s);
        if (!file.isFile()) {
            System.out.println("不是文件！！");
            return;
        }
        try {
            fun(file);
            System.out.println("成功");
        } catch (IOException e) {
            System.out.println("失败");
            e.printStackTrace();
        }
    }

    private static void fun(File file) throws IOException {
        System.out.println("KEY:");
        int a = new Scanner(System.in).nextInt();
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        /*int b;
        while((b=raf.read())!=-1){
            b^=a;
            raf.seek(raf.getFilePointer()-1);
            raf.write(b);
        }*/
        int n;
        byte[] bt = new byte[8192];
        while ((n = raf.read(bt)) != -1) {
            for (int i = 0; i < n; i++) {
                bt[i] ^= a;
            }
            raf.seek(raf.getFilePointer() - n);
            raf.write(bt, 0, n);
        }
    }
}
