package day_操作流;

import java.io.*;
import java.util.Scanner;

public class copy1 {
    public static void main(String[] args) throws IOException {
        System.out.println("原文件:");
        String s1 = new Scanner(System.in).nextLine();
        File f1 = new File(s1);
        if (!f1.isFile()) {
            System.out.println("不是文件");
            return;
        }
        System.out.println("目标文件:");
        String s2 = new Scanner(System.in).nextLine();
        File f2 = new File(s1);
        if (f2.isDirectory()) {
            System.out.println("不能是文件夹");
            return;
        }
        try {
            copy(s1, s2);
            System.out.println("成功");
        } catch (IOException e) {
            System.out.println("失败");
            e.printStackTrace();
        }

    }

    private static void copy(String s1, String s2) throws IOException {
        FileInputStream fis = new FileInputStream(s1);
        BufferedInputStream in = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream(s2, true);
        BufferedOutputStream out = new BufferedOutputStream(fos);
        int n;
        /*byte[] bytes = new byte[8192];
        while((n=in.read(bytes))!=-1){
            out.write(bytes,0,n);
        }*/
        while ((n = in.read()) != -1) {
            out.write(n);
        }
        in.close();
        out.close();
    }
}
