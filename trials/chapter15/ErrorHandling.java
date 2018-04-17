import java.io.*;
public class ErrorHandling {
  public static void main(String[] args) {
    try {
      FileWriter fw = new FileWriter("data.text");
    } catch(IOException e) {
      System.out.println("エラーが発生しました");
    }
  }
}
