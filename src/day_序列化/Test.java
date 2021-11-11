package day_序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/JAVA/abc/f5.txt"));
        Student s1 = new Student("9527", "唐伯虎", 19);
        oos.writeObject(s1);
        oos.close();
    }
}
