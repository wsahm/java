package day_线程;

public class Test7 {
    public static void main(String[] args) {
        Test6.R1 r1 = new Test6.R1();
        Thread t1 = new Thread(r1);
        t1.start();
        R1 r2 = new R1();
        while (true) {
            int i = r2.get();
            if (i % 2 != 0) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }

    static class R1 implements Runnable {
        static int i;

        public static synchronized void add() {
            i++;
            i++;
        }

        public static synchronized int get() {
            return i;
        }

        @Override
        public void run() {
            while (true) {
                add();
            }
        }
    }
}
