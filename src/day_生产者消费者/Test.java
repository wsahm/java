package day_生产者消费者;

public class Test {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Consumer cs = new Consumer(s1);
        Producer p1 = new Producer(s1);
        cs.start();
        p1.start();
    }
}
