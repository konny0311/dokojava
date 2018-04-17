import java.io.IOException;
public class q15_4 {
  public static void main(String[] args) throws IOException {
    System.out.println("起動しました");
    throw new IOException("エラー発生。終了します。");

  }
}
