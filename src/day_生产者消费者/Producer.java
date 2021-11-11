package day_生产者消费者;

import java.util.Random;

public class Producer extends Thread {//生产者
    private Stack s1;

    public Producer(Stack s1) {
        this.s1 = s1;
    }

    @Override
    public void run() {
        while (true) {
            char c = (char) ('a' + new Random().nextInt(26));
            synchronized (s1) {
                while (s1.isFull()) {
                    try {
                        s1.wait();
                    } catch (InterruptedException e) {
                    }
                }
                s1.push(c);
                System.out.println("压入<----" + c);
                s1.notifyAll();
            }
        }
    }
}
