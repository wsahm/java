package day0804_变形金刚;

public class Sword implements Weapon {

    @Override
    public void kill() {
        System.out.println("耍剑！！！");
    }

    @Override
    public String getName() {
        return "倚天剑";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_COLD;
    }
}
