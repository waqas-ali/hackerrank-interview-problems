package hacker.rank.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteProblem {

  public static void main(String[] args) {
    checkMagazine(null,null);
  }

  static void checkMagazine(String[] magazine, String[] note) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    for (String mag : magazine) {
      if (map.containsKey(mag)) {
        map.put(mag, map.get(mag)+1);
      }else {
        map.put(mag, 1);
      }
    }
    
    for ( String nt : note) {
      if ( map.containsKey(nt)) {
        int count = map.get(nt);
        if (count == 0) {
          System.out.println("No");
          return;
        }else {
          map.put(nt, count -1);
        }
      }else {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
    
    
  }

}
