package page5.q462;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int buf[] = new int[in.nextInt()];
    for(int i=0; i<buf.length; i++) buf[i] = in.nextInt();
    for(int i=in.nextInt(); i>0; i--)
      buf[in.nextInt()-1]--;
    for(int i : buf)
      System.out.println(i < 0 ? "yes" : "no");
  }
}
