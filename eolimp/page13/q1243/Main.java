package page13.q1243;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);

    int n = in.nextInt(), i, j, k;
    long v1, v2;
    long[] res=new long[n];

    for(i=0; i<n; i++) {
      k = in.nextInt();
      v1 = in.nextInt();

      for(j=0; j<k-1; j++) {
        v2 = in.nextInt();
        v1 = lcm(v1, v2);
      }
      res[i] = v1;
    }

    for(long l : res) System.out.println(l);
  }

  private static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a%b);
  }


  private static long lcm(long a, long b) {
    return (a/gcd(a, b))*b;
  }

}

