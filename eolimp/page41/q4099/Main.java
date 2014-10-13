package page41.q4099;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in).useDelimiter("[^\\w\\-]+");

    int max = 0;
    String maxS = "";
    while(in.hasNext()) {
      String s = in.next();
      if("E-N-D".equals(s)) break;
      else {
        int l = s.length();
        if(l > max) {
          max = l;
          maxS = s;
        }
      }
    }

    System.out.println(maxS.toLowerCase());
  }
}
