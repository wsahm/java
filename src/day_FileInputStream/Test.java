package day_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        fis = new FileInputStream("E:/JAVA/abc/f.txt");
        int n;
        while ((n = fis.read()) != -1) {
            System.out.println(n);
        }
        fis.close();

        System.out.println("---------------------");
        byte[] bt = new byte[5];
        fis = new FileInputStream("E:/JAVA/abc/f.txt");
        while ((n = fis.read(bt)) != -1) {
            System.out.println(n + ":" + Arrays.toString(bt));
        }
        fis.close();
    }
}
