public class SuperHero extends Hero{
  private boolean flying;
  public void fly() {
    super.run();
    this.flying = true;
    System.out.println("空を飛んだ");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }
}
