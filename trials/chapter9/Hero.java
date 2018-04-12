public class Hero {
String name;
int hp;
static int money;
// 初期値設定
Hero(String name) {
  this.name = name;
  this.hp = 100;
  this.money = 200;
}
Hero() {
  this("ダミー");
}
}
