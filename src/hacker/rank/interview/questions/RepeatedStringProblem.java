package hacker.rank.interview.questions;

public class RepeatedStringProblem {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s = "abcac";
    int n = 10;
    System.out.println(repeatedString(s, n));
  }

  static long repeatedString(String s, long n) {
    long count = 0;
    long aCount = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        aCount++;
      }
    }
    long mul = n / s.length();
    long rem = n % s.length();
    count = aCount * mul;
    for (int i = 0; i < rem; i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }
    return count;

  }

}
