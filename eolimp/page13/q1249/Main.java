package page13.q1249;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNextInt()) {
      int n = in.nextInt();
      double p = n * Math.log10(n);
      System.out.println((int)Math.pow(10, p-(int)p));
    }
  }
}
