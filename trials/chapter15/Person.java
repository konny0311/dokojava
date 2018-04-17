public class Person {
  int age;
  public void setAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException
      ("年齢は正の数であるべきです。入力されたのは" + age + "でした。");
    }
    this.age = age;
  }
}
