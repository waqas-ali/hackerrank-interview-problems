package hacker.rank.interview.questions;

public class JumpingCloudProblem {

  public static void main(String[] args) {
    int[] c = {0, 0, 0, 0, 1, 0};
    System.out.println(jumpingOnClouds(c));

  }
  
  static int jumpingOnClouds(int[] c) {
    int jumps = 0;
    int i =0;
    while (  i < c.length) {
      if ( i + 2 < c.length &&  c[i+2] == 0 ) {
        i = i +2;
        jumps++;
      }else if ( i + 1 < c.length && c[i+1] == 0) {
        i = i + 1;
        jumps++;
      }else {
        i++;
      }
    }
    return jumps;
  }

}
