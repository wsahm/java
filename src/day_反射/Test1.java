package day_反射;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        System.out.print("请输入完整包名：");
        String s = new Scanner(System.in).nextLine();
        Class<?> c = Class.forName(s);
        Object o1;
        Object o2;
        try {
            o1 = c.newInstance();
        } catch (Exception e) {
            System.out.println("无法使用无参构造");
        }
        try {
            Constructor<?> t = c.getConstructor(int.class);
            o2 = t.newInstance(5);
        } catch (Exception e) {
            System.out.println("无法执行int类型参数的构造方法");
        }
    }
}
