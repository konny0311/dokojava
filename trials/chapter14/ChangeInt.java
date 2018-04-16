public class ChangeInt {
  public static void main(String[] args) {
    int i1 = 15;
    Integer i2 = Integer.valueOf(i1);
    Integer i3 = i2;

    System.out.println(i2 instanceof Integer);
    System.out.println(i3 instanceof Integer);
  }
}
