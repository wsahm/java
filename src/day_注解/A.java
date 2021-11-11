package day_注解;

public class A {
    @Test(ip = 1, value = "第一个")
    public void a() {
        System.out.println("a方法");
    }

    public void b() {
        System.out.println("b方法");
    }

    @Test(ip = 2, value = "第二个")
    public void c() {
        System.out.println("c方法");
    }
}
