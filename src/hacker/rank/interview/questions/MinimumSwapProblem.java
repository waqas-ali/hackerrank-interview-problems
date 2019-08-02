package hacker.rank.interview.questions;

public class MinimumSwapProblem {
  public static void main(String args[]) {
    int[] a = {2,3,4,1,5};
    System.out.println(minimumSwaps(a));
  }
  
  static int minimumSwaps(int[] arr) {
    int swap = 0;
    int x = 0;
    while ( x < arr.length) {
      if (x + 1 == arr[x]) {
        x++;
      }else {
        int temp = arr[x]; // x = 0, arr[x] = 2
        arr[x] = arr[temp-1]; // x = 0, arr[1] = 3
        arr[temp-1] = temp;
        swap++;
      }
    }
    
    return swap;

  }
}
