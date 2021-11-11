package day_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("e:/JAVA/abc/f.txt", "rw");
        raf.write(97);
        raf.write(98);
        raf.write(99);
        byte[] a = {100, 101, 102, 103};
        raf.write(a);
        raf.write(a, 1, 2);
        raf.seek(0);
        int b;
        while ((b = raf.read()) != -1) {
            System.out.println(b);
        }
        raf.seek(0);
        byte[] bt = new byte[2];
        while ((b = raf.read(bt)) != -1) {
            System.out.println(b + ":" + Arrays.toString(bt));
        }
        raf.close();
    }
}
