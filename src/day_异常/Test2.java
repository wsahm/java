package day_异常;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        fun();
    }

    private static void fun() {
        System.out.print("请输入两个浮点数相除：");
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3;
        try {
            d3 = f(d1, d2);
            System.out.println(d3);
        } catch (ArithmeticException e) {
            System.out.println("不能除零");
            e.printStackTrace();
        }

    }

    private static double f(double d1, double d2) {
        if (d2 == 0.0) {
            ArithmeticException e = new ArithmeticException("/by zeros");
            throw e;
        }
        return d1 / d2;
    }

}
