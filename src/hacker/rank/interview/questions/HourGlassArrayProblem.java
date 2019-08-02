package hacker.rank.interview.questions;

public class HourGlassArrayProblem {

  public static void main(String[] args) {


  }

  static int hourglassSum(int[][] arr) {
    int sum = -100;
    int limit = 4;

    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < limit; j++) {
        int s = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
            + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        if (s > sum) {
          sum = s;
        }
      }
    }
    return sum;
  }

}
