package page41.q4098;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean sieve[] = new boolean[100001];
    Arrays.fill(sieve, true);
    sieve[0] = sieve[1] = false;

    for(int i=2; i<sieve.length; i++) {
      if(sieve[i]) {
        for(int j=i << 1; j<sieve.length; j+=i) {
          sieve[j] = false;
        }
      }
    }

    String s;
    while(!(s = in.nextLine()).equals("0")) {
      int max = -1;
      for(int l=s.length(), i=6; i > 0; i--) {
        for(int j=0; j<l-i+1; j++) {
          int c = Integer.parseInt(s.substring(j, j+i));
          if(c > 1 && c < sieve.length && sieve[c] && c > max) {
            max = c;
          }
        }
        if(max != -1) break;
      }
      System.out.println(max == -1 ? "" : max);
    }
  }
}
