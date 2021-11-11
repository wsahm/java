package day_集合;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("aaa");
        ll.add("dd");
        ll.add("ff");
        System.out.println(ll.get(2));
        System.out.println(ll.remove(2));
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
