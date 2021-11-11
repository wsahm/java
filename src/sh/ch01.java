package sh;

import java.util.Scanner;

public class ch01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        boolean b1 = runNine(n);
        if (b1) {
            System.out.println("闰年");
        } else
            System.out.println("平年");
    }

    static boolean runNine(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
            return true;
        else
            return false;
    }
}
