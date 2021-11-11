package day_操作流;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入目录:");
        String s = new Scanner(System.in).nextLine();
        System.out.println("KEY：");
        int n = new Scanner(System.in).nextInt();
        File f1 = new File(s);
        if (!f1.isDirectory()) {
            System.out.println("不是文件夹");
            return;
        }
        try {
            fun(f1, n);
            System.out.println("成功");
        } catch (IOException e) {
            System.out.println("失败");
            e.printStackTrace();
        }
    }

    private static void fun(File f1, int n1) throws IOException {
        File[] f = f1.listFiles();
        if (f == null) {
            return;
        }
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        for (File file : f) {
            /*if(file.isFile()){
                RandomAccessFile ra= new RandomAccessFile(file, "rw");
                byte[] bt=new byte[8192];
                int n;
                if((n=ra.read(bt))!=-1){
                    for (int i=0;i<n;i++) {
                        bt[i]^=n1;
                    }
                    ra.seek(ra.getFilePointer()-n);
                    ra.write(bt,0,n);
                }
            }else{
                fun(file,n1);
            }*/
            if (file.isFile()) {
                bis = new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
                bos = new BufferedOutputStream(new FileOutputStream(file.getAbsolutePath()));
                int n;
                while ((n = bis.read()) != -1) {
                    n ^= n1;
                    bos.write(n);
                }
                bos.close();
                bis.close();
            } else {
                fun(file, n1);
            }
        }

    }
}
