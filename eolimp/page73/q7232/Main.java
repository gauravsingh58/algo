package page73.q7232;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int ns[] = new int[6];
    for(int i=0; i<ns.length; i++)
      ns[i] = in.nextInt();
    int v = Math.min(ns[0], ns[3]),
        d = Math.min(ns[1], ns[4]),
        b1 = Math.min(ns[3] - v + ns[4] - d, ns[2]),
        b2 = Math.min(ns[0] - v + ns[1] - d, ns[5]);
    System.out.println(v + d + b1 + b2 + Math.min(ns[2] - b1, ns[5] - b2));
  }
}
