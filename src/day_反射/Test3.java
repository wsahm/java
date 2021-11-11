package day_反射;

import java.lang.reflect.Method;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Class<Date> c = Date.class;
        Date d = new Date();
        Method getTime = c.getDeclaredMethod("getTime");
        Method setTime = c.getDeclaredMethod("setTime", long.class);
        Object o1 = getTime.invoke(d);
        Object o2 = setTime.invoke(d, 456879321L);
        System.out.println(o1);
        System.out.println(d);
    }
}
