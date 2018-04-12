public class Hero {
  private String name = "aaa";
  private double hp = 100;
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  public double getHp() {
    return this.hp;
  }
  public void setHp(double hp) {
    this.hp = hp;
  }
}
