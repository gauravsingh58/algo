package page8.q784;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.nextInt() != 0) {
      in.nextLine();
      int min = Integer.MAX_VALUE, i = 0, j = -1, p = -1;
      for(char c : in.nextLine().toCharArray()) {
        i++;
        if(c == 'Z') {
          min = 0;
          break;
        } else if(c == 'R' || c == 'D') {
          if(j == -1) {
            j = i;
            p = c;
          } else if(p == c) {
            j = i;
          } else {
            min = Math.min(min, i-j);
            j = i;
            p = c;
          }
        }
      }
      System.out.println(min);
    }
  }
}
