import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class q14_1 {
  public static void main(String[] args) throws Exception {
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int d = c.get(Calendar.DAY_OF_MONTH) + 100;
    c.set(Calendar.DAY_OF_MONTH, d);
    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String s = f.format(future);
    System.out.println(s);
  }
}
