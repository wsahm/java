package day_日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的生日（yyyy-MM-dd）");
        String s1 = new Scanner(System.in).nextLine();
        //创建SimpleDateFormat对象将输入的日期转为Deta型
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sf1.parse(s1);
        //System.currentTimeMillis()方法可以获取系统时间，d1.getTime返回d1对象内部封装的时间
        long d2 = System.currentTimeMillis() - d1.getTime();
        d2 = d2 / 1000 / 60 / 60 / 24;
        System.out.println("你存在了" + d2 + "天");
    }
}
