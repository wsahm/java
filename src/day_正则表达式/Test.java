package day_正则表达式;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        String s = "\\d{3}|\\d{4}[xX]";
        if (s1.matches(s)) {
            System.out.println("格式正确");
        } else {
            System.out.println("格式错误");
        }
    }
}
