package day_线程;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        int r;
        long t;
        t = System.currentTimeMillis();
        r = f(10000000);
        t = System.currentTimeMillis() - t;
        System.out.println("个数为：" + r + "\n运行时间为：" + t);
        t = System.currentTimeMillis();
        r = f1(10000000);
        t = System.currentTimeMillis() - t;
        System.out.println("个数为：" + r + "\n运行时间为：" + t);
    }

    private static int f1(int i) throws InterruptedException {
        T1 t1 = new T1(1, 2000000);
        T1 t2 = new T1(2000000, 4000000);
        T1 t3 = new T1(4000000, 6000000);
        T1 t4 = new T1(6000000, 8000000);
        T1 t5 = new T1(8000000, 10000000);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        return t1.count + t2.count + t3.count + t4.count + t5.count;
    }

    private static int f(int i) throws InterruptedException {
        T1 t1 = new T1(1, i);
        t1.start();
        t1.join();
        return t1.count;
    }

    static class T1 extends Thread {
        int stat;
        int end;
        int count = 0;

        public T1(int stat, int end) {
            this.stat = stat;
            this.end = end;
            if (stat < 3) {
                count = 1;
                this.stat = 3;
            }
        }

        @Override
        public void run() {
            for (int i = stat; i < end; i++) {
                if (fun(i)) {
                    count++;
                }
            }
        }

        private boolean fun(int i) {
            double max = Math.sqrt(i) + 1;
            for (int j = 2; j < max; j++) {
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
