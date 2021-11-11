package day_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        Scanner sc1 = new Scanner(System.in);
        String s = sc1.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (hm.get(c1) == null) {
                hm.put(c1, 1);
            } else {
                int a = hm.get(c1);
                hm.put(c1, a + 1);
            }
        }
        System.out.println(hm);
    }
}
