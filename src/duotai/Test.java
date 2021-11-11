package duotai;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入猫叫什么：");
        c1.name = sc1.nextLine();
        System.out.print("请输入狗叫什么：");
        d1.name = sc1.nextLine();
        fun(d1);

    }

    static void fun(Paten p1) {
        System.out.println(p1.go());
        Dog d1 = (Dog) p1;
        System.out.print(d1.to());
    }
}
