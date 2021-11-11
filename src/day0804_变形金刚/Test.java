package day0804_变形金刚;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Sword s1 = new Sword();
        Ak47 a1 = new Ak47();
        Lyb l = new Lyb();
        Transformer t1 = new Transformer();
        while (true) {
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(3);
            switch (r) {
                case 0:
                    t1.setWapon(s1);
                    break;
                case 1:
                    t1.setWapon(a1);
                    break;
                case 2:
                    t1.setWapon(l);
                    break;
            }
            t1.attack();
        }
    }
}
