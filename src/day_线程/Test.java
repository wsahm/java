package day_线程;

public class Test {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        t1.start();
        t2.start();
        System.out.println("------------------------");
    }

    static class T1 extends Thread {
        @Override
        public void run() {
            String s = getName();
            for (int i = 0; i < 100; i++) {
                System.out.println(s + ":" + i);
            }
        }
    }
}
