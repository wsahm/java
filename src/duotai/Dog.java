package duotai;

public class Dog extends Paten {
    public Dog() {
    }

    public Dog(String name, String xb, int num) {
        super(name, xb, num);
    }

    @Override
    public String go() {
        return "旺~";
    }

    public String to() {
        return name;
    }
}
