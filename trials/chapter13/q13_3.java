public class Main {
  public static void main(String[] args) {
    Y[] list = new Y[2];
    list[0] = new A();
    list[1] = new B();
    for (Y obj : list) {
      obj.b();
    }
  }
}
