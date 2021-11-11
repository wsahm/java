package day_FileOutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\JAVA\\abc\\f.txt", true);
        fos.write(96);
        fos.write(97);
        fos.write(98);
        fos.write(356);
        byte[] bt = {99, 100, 101, 102};
        fos.write(bt, 1, 3);
        fos.close();
    }
}
