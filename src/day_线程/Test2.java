package day_线程;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Thread th = new Thread() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
                while (true) {
                    String s = sdf.format(new Date());
                    System.out.println(s);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("被打断！");
                        break;
                    }
                }
            }
        };
        th.start();
        System.out.println("按空格打断线程" + Thread.currentThread());
        new Scanner(System.in).nextLine();
        th.interrupt();
    }
}
