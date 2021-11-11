package day_注解;

import java.lang.reflect.Method;

public class Runner {
    public static void run(Class c) {
        try {
            Object o = c.newInstance();
            Method[] m = c.getMethods();
            for (Method m1 : m) {
                Test t1 = m1.getAnnotation(Test.class);//得到m1的注解
                if (t1 != null) {
                    System.out.println("测试IP等于：" + t1.ip());
                    System.out.println("测试value等于：" + t1.value());
                    m1.invoke(o);
                }
            }
        } catch (Exception e) {
            System.out.println("运行时失败");
            e.printStackTrace();
        }
    }
}
