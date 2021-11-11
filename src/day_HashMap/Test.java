package day_HashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(9528, "a");
        hm.put(9525, "b");
        hm.put(9523, "c");
        hm.put(9524, "d");
        System.out.println(hm);
        String s = hm.get(9528);
        System.out.println(s);
        System.out.println(hm.remove(9528));
        System.out.println(hm);
    }
}
