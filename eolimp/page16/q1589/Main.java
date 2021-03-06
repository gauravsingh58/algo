package page16.q1589;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  private static class Key implements Comparable{
    private int index;
    private double time;

    public Key(int index, int c, int v) {
      this.index = index;
      this.time = (double)c / v;
    }

    @Override
    public int compareTo(Object o) {
      Key k = (Key)o;
      double diff = this.time - k.time;
      if(diff < 0)
        return 1;
      else if(diff > 0)
        return -1;
      return k.index - this.index;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), i = 1;

    TreeSet<Key> s = new TreeSet<Key>();
    while(n-- > 0) {
      s.add(new Key(i++, in.nextInt(), in.nextInt()));
    }

    StringBuilder sb = new StringBuilder();
    for(Key k : s.descendingSet())
      sb.append(' ').append(k.index);
    System.out.println(sb.substring(1));
  }
}
