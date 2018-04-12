public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    if (hp >= 0) {
    this.hp = hp;
  } else {
    this.hp = 0;
  }
  }
  public int getMp() {
    return this.mp;
  }
  public void setMp(int mp) {
    if (mp >= 0) {
    this.hp = mp;
  } else {
    throw new IllegalArgument Exception("エラーメッセージ");
  }
  }
  public Wand getWand() {
    return this.wand;
  }
  public void setWand(Wand wand) {
    if (wand != null) {
    this.wand = wand;
  }
  }
  public void heal(Hero h) {
    if (wand != null) {
    int basePoint = 10;
    int recovPoint = (int) (basePoint * this.getWand().getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  } else {
    throw new IllegalArgument Exception("エラーメッセージ");
  }
  }
}
