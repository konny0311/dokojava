public class Hero {
  String name;
  int hp;
  void attack() {

  };
  void run() {
    System.out.println(this.name + "は逃げ出した！");
    System.out.println("Game over!!!!!");
    System.out.println("最終HPは" + this.hp + "でした。");
  };
  void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は" + sec + "秒眠った！");
    System.out.println("HPが" + sec + "ポイント回復した！");
  };
  void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は転んだ！");
    System.out.println("5のダメージを受けた！");
  };
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  };
}
