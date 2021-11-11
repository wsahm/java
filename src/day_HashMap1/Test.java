package day_HashMap1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "张三", "英语");
        Student s2 = new Student(1, "张三", "英语");
        HashMap<Student, Integer> hm1 = new HashMap<>();
        hm1.put(s1, 90);
        hm1.put(s2, 91);
        System.out.println(hm1);
    }
}
