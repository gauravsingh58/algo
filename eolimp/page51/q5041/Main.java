package page51.q5041;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    in.nextLine();

    Pattern p = Pattern.compile("^\\s*(?:\\+|\\-)?\\d+(\\.\\d+)?(?:e(?:\\+|\\-)?\\d+)?\\s*$",
        Pattern.CASE_INSENSITIVE);
    while(t-- > 0) {
      System.out.println(p.matcher(in.nextLine()).matches() ? "LEGAL" : "ILLEGAL");
    }
  }
}
