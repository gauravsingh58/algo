package page5.q475;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String s = new Scanner(System.in).nextLine();

    if(s.isEmpty()) {
      System.out.println();
      return;
    }

    int l = s.length(), i = 1;
    while(!(l > Math.pow(i-1, 2) && l <= Math.pow(i, 2))) i++;
    StringBuilder sb = new StringBuilder();
    for(int j=0; j<i; j++)
      for(int k=j; k<i*i; k+=i)
        sb.append(s.charAt(Math.min(k, l-1)));
    System.out.println(sb.toString());
  }
}
