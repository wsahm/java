package day_丑数;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("输入第几个丑数：");
        int n = new Scanner(System.in).nextInt();
        System.out.println("第" + n + "个丑数为：" + f(n));
    }

    private static long f(int n) {
        LinkedList<Long> lk3 = new LinkedList<>();
        LinkedList<Long> lk5 = new LinkedList<>();
        LinkedList<Long> lk7 = new LinkedList<>();
        long r = 0;
        lk3.add(3L);
        lk5.add(5L);
        lk7.add(3L);
        for (int i = 1; i <= n; i++) {
            long a = lk3.getFirst();
            long b = lk5.getFirst();
            long c = lk7.getFirst();
            r = Math.min(a, Math.min(b, c));
            if (r == a) lk3.remove(a);
            if (r == b) lk5.remove(b);
            if (r == c) lk7.remove(c);
            lk3.add(r * 3);
            lk5.add(r * 5);
            lk7.add(r * 7);
        }
        return r;
    }
}
