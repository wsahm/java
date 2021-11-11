package day_生产者消费者;

public class Consumer extends Thread {//消费者
    private Stack s1;

    public Consumer(Stack s1) {
        this.s1 = s1;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s1) {
                while (s1.isEmpty()) {
                    try {
                        s1.wait();
                    } catch (InterruptedException e) {
                    }
                }
                char c = s1.pop();
                System.out.println("弹出>----" + c);
                s1.notifyAll();
            }
        }
    }
}
