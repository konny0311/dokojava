import java.io.InputStream;
import java.net.URL;
public class GetHtml {
  public static void main (String[] args) throws Exception {
    URL u = new URL("https://jp.techcrunch.com/");
    InputStream is = u.openStream();
    int i = is.read();
    while (i != -1) {
      char c = (char) i;
      System.out.print(c);
      i = is.read();
    }
  }
}
