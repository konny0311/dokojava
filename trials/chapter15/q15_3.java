public class q15_3 {
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt('三');
    }
    catch (NumberFormatException e) {
      System.out.println("漢数字は使用できません。");
    }
  }
}
