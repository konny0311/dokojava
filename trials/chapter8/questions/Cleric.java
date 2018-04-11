public class Cleric {
  String name;
  int hp = 50;
  final int maxhp = 50;
  int mp = 10;
  final int maxmp = 10;

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
