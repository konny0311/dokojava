import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String filename = "test.txt";
    FileWriter fw = new FileWriter(filename);
    fw.write('あ');
    fw.write('い');
    fw.close();
  }
}
