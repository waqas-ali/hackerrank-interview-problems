package hacker.rank.interview.questions;

public class ValleyCountProblem {

  public static void main(String args[]) {
    String s = "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD";
    int count = 100;
    System.out.println(countingValleys(count,s));
  }
  
  static int countingValleys(int n, String s) {
    
    boolean valley = false;
    int steps = 0;
    boolean atSea = true;
    int valleyCount = 0;

    for ( int i = 0; i<n; i++) {
        if ( atSea == true ) {
            if ( s.charAt(i) == 'D') {
                valley = true;
                steps++;
            }else {
                steps++;
            }
            atSea = false;
            continue;
        }

        if ( valley == true && s.charAt(i) == 'U') {
            steps--;
        }else if ( valley == true && s.charAt(i) == 'D') {
            steps++;
        }else if ( valley == false && s.charAt(i) == 'D') {
            steps--;
        }else if ( valley == false && s.charAt(i) == 'U') {
            steps++;
        }

        if ( valley == true && steps == 0) {
            valleyCount++;
            valley = false;
        }
        
        if ( steps == 0 ) {
            atSea = true;
        }

    }

    return valleyCount;

}

}
