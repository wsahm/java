package duotai;

public class Cat extends Paten {
    public Cat() {
    }

    public Cat(String name, String xb, int num) {
        super(name, xb, num);
    }

    @Override
    public String go() {
        return "瞄~";
    }

    public String to() {
        return name;
    }
}
