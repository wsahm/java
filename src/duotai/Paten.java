package duotai;

public class Paten {
    String name;
    String xb;
    int num = 100;

    public Paten() {
    }

    public Paten(String name, String xb, int num) {
        this.name = name;
        this.xb = xb;
        this.num = num;
    }

    public String toString() {
        return "Paten{" +
                "name='" + name + '\'' +
                ", xb='" + xb + '\'' +
                ", num=" + num +
                '}';
    }

    public String go() {
        return "动物叫";
    }
}
