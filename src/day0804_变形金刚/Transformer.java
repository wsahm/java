package day0804_变形金刚;

import java.util.Scanner;

public class Transformer {
    private Weapon w1 = null;

    public void setWapon(Weapon w1) {
        this.w1 = w1;
    }

    public void attack() {
        if (w1 == null) {
            System.out.println("用牙咬！！");
            return;
        }
        String s1 = null;
        switch (w1.getType()) {
            case Weapon.TYPE_COLD:
                s1 = "冷兵器";
                break;
            case Weapon.TYPE_HOT:
                s1 = "热武器";
                break;
            case Weapon.TYPE_NUCLEAR:
                s1 = "核武器";
                break;
        }
        System.out.println("使用" + w1.getName() + s1 + "进攻");
        w1.kill();
    }
}
