package ty;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入计算几层汉洛塔：");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        f(n);
    }

    static void f(int n) {
        f(n, "z1", "z2", "z3");
    }

    static void f(int n, String z1, String z2, String z3) {
        if (n == 1) {
            System.out.println(z1 + "---->" + z3);
            return;
        }
        f(n - 1, z1, z3, z2);
        System.out.println(z1 + "---->" + z3);
        f(n - 1, z2, z1, z3);
    }
}
