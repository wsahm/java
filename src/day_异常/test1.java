package day_异常;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        try {
            f();
        } catch (ParseException e) {
            System.out.println("日期格式错误");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件创建错误!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("其他错误！");
        }
    }

    private static void f() throws ParseException, IOException {
        System.out.print("请输入你的生日（yyyy-MM-dd）：");
        String s = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        String s1 = "e:\\JAVA\\" + d.getTime() + ".txt";
        File f = new File(s1);
        f.createNewFile();
    }
}
