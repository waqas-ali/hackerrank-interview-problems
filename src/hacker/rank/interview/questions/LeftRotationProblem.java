package hacker.rank.interview.questions;

public class LeftRotationProblem {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  static int[] rotLeft(int[] a, int d) {

    int temp = 0;
    for (int i = 0; i < d; i++) {
      temp = a[0];
      for (int j = 0; j < a.length - 1; j++) {
        a[j] = a[j + 1];
      }
      a[a.length - 1] = temp;
    }
    return a;
  }
}
