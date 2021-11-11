package day_序列化;

import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String s = new Scanner(System.in).nextLine();
        File file = new File(s);
        if (!file.isFile()) {
            System.out.println("不是文件");
            return;
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s));
        Student s1 = (Student) ois.readObject();
        System.out.println(s1.toString());
        ois.close();
    }
}
