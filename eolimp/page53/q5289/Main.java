package page53.q5289;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    StringBuilder sb = new StringBuilder();
    while(in.hasNextLine()) {
      String line[] = in.nextLine().split("\\s");
      if("?".equals(line[0])) {
        System.out.println(Pattern.compile(line[1], Pattern.CASE_INSENSITIVE).matcher(sb).find() ? "YES" : "NO");
      } else {
        sb.append(line[1]);
      }
    }
  }
}
