package day_File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        new Scanner(System.in).nextLine();
        File f1 = new File("e:/abc");
        f1.mkdir();//创建文件夹
        new Scanner(System.in).nextLine();
        File f2 = new File("e:/abc/f");
        f2.createNewFile();//创建文件
        new Scanner(System.in).nextLine();
        f2.delete();
        new Scanner(System.in).nextLine();
        f1.delete();
    }
}
