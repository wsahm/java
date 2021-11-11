package day_线程;

public class Test1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread r1 = new Thread(t1);
        Thread r2 = new Thread(t1);
        r1.start();
        r2.start();
        Thread r3 = Thread.currentThread();
        String s = r3.getName();
        System.out.println(s);
    }

    static class T1 implements Runnable {
        @Override
        public void run() {
            Thread t = Thread.currentThread();
            String s = t.getName();
            for (int i = 0; i < 100; i++) {
                System.out.println(s + ":" + i);
            }
        }
    }
}
