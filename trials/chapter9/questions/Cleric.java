public class Cleric {
  String name;
  int hp = 50;
  static final int maxhp = 50;
  int mp = 10;
  static final int maxmp = 10;

  Hero(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  Hero(String name, int hp) {
    this(name, hp, Cleric.maxmp);
  }
  Hero(String name) {
    this(name, Cleric.maxhp);
  }
  public void selfAid() {
    this.mp -= 5;
    this.hp = this.maxhp;
  }
  public void pray(int sec) {
    int num = new java.util.Random().nextInt(3);
    int recovered = num + sec;
    int recovered_actual = Math.min(this.maxmp - this.mp, recovered);
    this.mp += recovered_actual;
    return recovered_actual;
  }
}
