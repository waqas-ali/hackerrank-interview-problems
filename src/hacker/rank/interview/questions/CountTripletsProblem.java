package hacker.rank.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountTripletsProblem {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Long[] values = {1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L,1L};
    List<Long> list = Arrays.asList(values);
    long r = 1;
    System.out.println(countTriplets(list, r));
  }

  static long countTriplets(List<Long> arr, long r) {
    long count = 0;
    Map<Long,Integer> map = new HashMap<Long,Integer>();
    
    for (Long val : arr) {
      if ( map.containsKey(val)) {
        int cn = map.get(val);
        map.put(val, cn + 1);
      }else {
        map.put(val, 1);
      }
    }
      
      Iterator<Long> it = map.keySet().iterator();
      
      while ( it.hasNext()) {
        Long key = it.next();
        int c1 = map.get(key);
        if ( r == 1) {
          count += (c1*(c1-1) * (c1-2) ) / 6.0;
          continue;
        }
        long r1 = key * r;
        if ( map.containsKey(r1)) {
          int c2 = map.get(r1);
          long r2 = r1 * r;
          if ( map.containsKey(r2)) {
            int c3 = map.get(r2);
            count += c1 * c2 * c3; 
          }
        }
      }
      
    return count;
  }

}
