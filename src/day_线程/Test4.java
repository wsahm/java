package day_线程;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        char[] a = {'-', '-', '-', '-', '-', '-', '-'};
        int p = 0;
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (a) {
                        for (int i = 0; i < a.length; i++) {
                            a[i] = a[i] == '-' ? '*' : '-';
                        }
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (a) {
                        System.out.println(Arrays.toString(a));
                    }
                }
            }
        }.start();
    }
}
