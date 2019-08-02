package hacker.rank.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SherlockAnagramProblem {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "cdcd";
    System.out.println(sherlockAndAnagrams(s));

  }

  static int sherlockAndAnagrams(String s) {
    int pairs = 0;

    Map<String, Integer> map = new HashMap<String,Integer>();

    for (int i = 0; i < s.length(); i++) {
      String sub = s.substring(i, i+1);
      //System.out.println(sub);
      if ( map.containsKey(sub)) {
        int val = map.get(sub);
        map.put(sub, val + 1);
      }else {
        map.put(sub, 1);
      }
      for (int j = i + 1; j < s.length(); j++) {
        String s2 = sub + s.substring(i+1,j+1);
        //System.out.println(s2);
        char[] c1 = s2.toCharArray();
        Arrays.sort(c1);
        String sc = new String(c1);
        if ( map.containsKey(sc)) {
          int val = map.get(sc);
          map.put(sc, val + 1);
        }else {
          map.put(sc, 1);
        }
      }
    }
    Iterator<Integer> it = map.values().iterator();
    while ( it.hasNext() ) {
      int sum = it.next();
      if ( sum == 1) {
        continue;
      }else if ( sum == 2) {
        pairs += 1;
      }else if ( sum > 2){
        pairs += (sum * (sum -1) ) / 2;
      }
    }
    return pairs;
  }

  static boolean isAnagram(String s1, String s2) {
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) {
        return false;
      }
    }
    return true;
  }


}
