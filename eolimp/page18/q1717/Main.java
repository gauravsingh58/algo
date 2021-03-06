package page18.q1717;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    while(n-- > 0) {
      char w[] = in.next().toCharArray(),
           t[] = in.next().toCharArray();

      RabinKarpHash l = new RabinKarpHash(w.length),
                    c = new RabinKarpHash(w.length);

      for(char ch : w)
        l.eat(ch);
      for(int i=0; i<w.length; ++i)
        c.eat(t[i]);

      int cnt = l.hashvalue == c.hashvalue ? 1 : 0;
      for(int i=w.length; i<t.length; i++) {
        c.update(t[i-w.length], t[i]);
        if(l.hashvalue == c.hashvalue) cnt++;
      }
      System.out.println(cnt);
    }
  }
}

// rolling hash class is taken from
// https://github.com/lemire/rollinghashjava
class RabinKarpHash {

  // myn is the length in characters of the blocks you want to hash
  public RabinKarpHash(int myn) {
    n = myn;
    BtoN = 1;
    for (int i=0; i < n ; ++i) {
      BtoN *= B;
    }
  }

  // add new character  (useful to initiate the hasher)
  // return 32 bits (not even universal)
  public int eat(char c) {
    hashvalue = B*hashvalue + hasher.hashvalues[c];
    return hashvalue;
  }

  // remove old character and add new one
  // return 32 bits (not even universal)
  public int update(char outchar, char inchar) {
    hashvalue = B*hashvalue +hasher.hashvalues[inchar] - BtoN * hasher.hashvalues[outchar];
    return hashvalue;
  }

  public int hashvalue;
  int n;
  int BtoN;
  static CharacterHash hasher = CharacterHash.getInstance();
  final static int B = 31;
}

class CharacterHash {
  public int hashvalues[] = new int[1<<16];

  public CharacterHash() {
    Random r = new Random();
    for(int k = 0; k<hashvalues.length;++k)
      hashvalues[k] = r.nextInt();
  }

  public static CharacterHash getInstance() {
    return charhash;
  }

  static CharacterHash charhash = new CharacterHash();
}
