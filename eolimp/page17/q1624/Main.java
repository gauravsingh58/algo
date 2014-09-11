package page17.q1624;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int d = in.nextInt(), m = in.nextInt(), y = in.nextInt();
    GregorianCalendar g = new GregorianCalendar(y, m-1, d);
    g.add(Calendar.DAY_OF_YEAR, 2);
    System.out.println(g.get(Calendar.DAY_OF_MONTH) + " " +
                       (g.get(Calendar.MONTH)+1) + " " +
                       g.get(Calendar.YEAR));
  }
}
