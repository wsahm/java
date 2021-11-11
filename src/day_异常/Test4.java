package day_异常;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        f();
    }

    private static void f() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String s1 = sc1.nextLine();
        System.out.print("请输入密码：");
        String s2 = sc1.nextLine();
        try {
            fun(s1, s2);
            System.out.println("登录成功！！");
        } catch (UserNameNotFoundException e) {
            System.out.println("用户名不正确！！");
        } catch (WrongPasswordException e) {
            System.out.println("密码不正确！！");
        }
    }

    private static void fun(String s1, String s2) throws UserNameNotFoundException, WrongPasswordException {
        if (!s1.equals("abc")) {
            throw new UserNameNotFoundException();
        }
        if (!s2.equals("123")) {
            throw new WrongPasswordException();
        }
    }
}
