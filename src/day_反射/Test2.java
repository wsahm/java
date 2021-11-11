package day_反射;

import java.lang.reflect.Field;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class c = Integer.class;
        Integer a = Integer.valueOf(5);
        Field f = c.getDeclaredField("value");
        f.setAccessible(true);
        Object o = f.get(a);
        System.out.println(o);
        f.set(a, 6);
        Object o1 = f.get(a);
        System.out.println(o1);

    }
}
