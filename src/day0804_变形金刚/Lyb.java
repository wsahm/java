package day0804_变形金刚;

public class Lyb implements Weapon {
    @Override
    public void kill() {
        System.out.println("用狼牙棒打人！！");
    }

    @Override
    public String getName() {
        return "狼牙棒";
    }

    @Override
    public int getType() {
        return Weapon.TYPE_NUCLEAR;
    }
}
