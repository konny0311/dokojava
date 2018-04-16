import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
  public static void main(String[] args) throws Exception {
    Date now = new Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy年mm月dd日 HH時mm分ss秒");
    String s = f.format(now);
    System.out.println(s);

  }
}
