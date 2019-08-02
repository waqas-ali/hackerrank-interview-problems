package hacker.rank.interview.questions;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayManipulationProblem {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //int[][] a = {{1, 2, 100}, {2, 7, 100}, {3, 4, 100}, {4, 6, 100},{5, 7, 100}};
    int[][] a = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};
    sort2DArray(a);
    System.out.println(arrayManipulation(9, a));
  }

  static long arrayManipulation(int n, int[][] queries) {
    long max = 0;
    
    int[] a = new int[n+1];
    
    for ( int i =0; i < queries.length; i++) {
      int start = queries[i][0];
      int end = queries[i][1];
      int value = queries[i][2];
      
      a[start-1] += value;
      a[end] -= value;
    
    }
    long sum = 0;
    for ( int i =0; i< n; i++) {
      sum += a[i];
      max = Math.max(max, sum);
    }
    
    
        
    /*
    long lmax = 0;

    int start = queries[0][0];
    int end = queries[0][1];
    int value = queries[0][2];

    int index = end;
    int preStart = start;
    int preEnd = end;
    int preValue = value;
    lmax = value;

    for (int i = 1; i < queries.length; i++) {

      start = queries[i][0];
      end = queries[i][1];
      value = queries[i][2];

      if (start <= index ) {
        lmax += value;
        preStart = start;
        preEnd = end;
        preValue = value;
        
        if ( end < index) {
          index = end;
        }
        
      } else {
        if (lmax > max) {
          max = lmax;
        }
        
        if ( start >= preStart ) {
          lmax = preValue + value;
          preStart = start;
          preEnd = end;
          preValue = value;
          
          if ( end < preEnd) {
            index = end;
          }else {
            index = preEnd;
          }  
        }
        
      }
      if (lmax > max) {
        max = lmax;
      }

    }
    */
    return max;
  }
  
  public static void sort2DArray(int[][] array) {
    Arrays.sort(array, new Comparator<int[]>() {
      @Override
      // arguments to this method represent the arrays to be sorted
      public int compare(int[] o1, int[] o2) {
        // get the item ids which are at index 0 of the array
        Integer itemIdOne = o1[0];
        Integer itemIdTwo = o2[0];
        return itemIdOne.compareTo(itemIdTwo);
      }
    });
  }

}
