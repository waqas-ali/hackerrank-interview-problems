package hacker.rank.interview.questions;

import java.util.Arrays;

public class TwoStringProblem {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s1 = "hello";
    String s2 = "world";
    System.out.println(twoStrings(s1,s2));
  }

  static String twoStrings(String s1, String s2) {
    String found = "NO";
    
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    
    Arrays.sort(c1);
    Arrays.sort(c2);
    
    int x1 = 0;
    int x2 = 0;
    
    while ( x1 < c1.length && x2 < c2.length) {
      if ( c1[x1] == c2[x2] ) {
        found = "YES";
        break;
      }else if ( c1[x1] > c2[x2]) {
        x2++;
      }else {
        x1++;
      }
      
    }
    
    return found;

  }
  
  
}
