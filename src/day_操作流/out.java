package day_操作流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class out {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("e:/JAVA/abc/f1.txt"));
        out.write(97);
        out.write(98);
        out.write(99);
        out.flush();
        out.close();
    }
}
