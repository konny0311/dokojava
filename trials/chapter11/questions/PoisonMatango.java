public class PoisonMatango extends Matango {
  private int pattack = 5;
  public void attack(Hero h) {
    super.attack(h);
    if (pattack > 0) {
      System.out.println("更に毒をばらまいた！");
      h.setHp(h.getHp() * 0.8);
      System.out.println((h.getHp() * 0.2) + "ポイントのダメージ！");
      pattack -= 1;
      System.out.println("勇者のHPは" + h.getHp() + "です。");
    }
  }

public PoisonMatango(char suffix) {
super(suffix);
}
}
