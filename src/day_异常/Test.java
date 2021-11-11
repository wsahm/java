package day_异常;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {
            try {
                fun();
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("请输入两个数！");
            } catch (ArithmeticException e) {
                System.out.println("不能除0！");
            } catch (Exception e) {
                System.out.println("出错，请重试！");
            } finally {
                System.out.println("---------------");
            }
        }
    }

    private static void fun() {
        System.out.println("请输入");
        String s = new Scanner(System.in).nextLine();
        String[] a = s.split(",");
        int b = Integer.parseInt(a[0]);
        int c = Integer.parseInt(a[1]);
        int d = b / c;
        System.out.println(d);
    }

}
