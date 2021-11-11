package day_反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.print("请输入完整类名：");
        String s = new Scanner(System.in).nextLine();
        Class<?> cs = Class.forName(s);
        System.out.println(cs.getPackage().getName());
        System.out.println(cs.getName());
        System.out.println(cs.getSimpleName());
        System.out.println("------变量-----");
        //类型
        f1(cs);
        //变量
        f2(cs);
        //方法
        f3(cs);
    }

    private static void f3(Class<?> cs) {
        Field[] f = cs.getDeclaredFields();
        for (Field f1 : f) {
            //修饰符
            String m = Modifier.toString(f1.getModifiers());
            //类型
            String t = f1.getType().getSimpleName();
            //变量
            String n = f1.getName();
            System.out.println(m + " " + t + " " + n);
        }
    }

    private static void f2(Class<?> cs) {
    }

    private static void f1(Class<?> cs) {
    }
}
