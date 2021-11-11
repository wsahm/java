package day0804_变形金刚;

public interface Weapon {
    int TYPE_COLD = 9527;
    int TYPE_HOT = 9528;
    int TYPE_NUCLEAR = 9529;

    void kill();//攻击

    String getName();//武器名

    int getType();//武器属于那种
}
