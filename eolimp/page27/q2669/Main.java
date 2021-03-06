package page27.q2669;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), m = in.nextInt();

    int[][] data = new int[n][m];
    for(int i=0; i<n; i++)
      for(int j=0; j<m; j++)
        data[i][j] = in.nextInt();

    System.out.println(m + " " + n);
    for(int i=0; i<m; i++) {
      for(int j=n-1; j>-1; j--)
        System.out.print(data[j][i] + (j==0 ? "" : " "));
      System.out.println();
    }
  }
}
