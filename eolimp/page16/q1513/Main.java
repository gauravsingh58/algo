package page16.q1513;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    while(t-- > 0)
      System.out.println(getPostOrder(in.nextInt(), in.next(), in.next().trim()));
  }

  private static String getPostOrder(int n, String pre, String in) {
    if(n < 2) return in;

    char root = pre.charAt(0);
    int i = in.indexOf(root);

    StringBuilder sb = new StringBuilder();
    if(i > 0)
      sb.append(getPostOrder(i, pre.substring(1, i+1), in.substring(0, i)));
    if(-1 < i && i < n-1)
      sb.append(getPostOrder(n-i-1, pre.substring(i+1), in.substring(i+1)));
    sb.append(root);
    return sb.toString();
  }

}
