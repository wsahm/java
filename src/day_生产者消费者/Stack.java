package day_生产者消费者;

public class Stack {//栈
    private char[] c = new char[5];
    private int index;

    public void push(char c1) {//压栈
        c[index] = c1;
        index++;
    }

    public char pop() {
        index--;
        return c[index];
    }

    public boolean isFull() {
        return index == 5;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
