public class FinalTarget {
  public static void main(String[] args) {
    double hwAvg = 95;
    double examAvg = 80;
    double targetAvg = 90;
    double requiredFinalScore = (targetAvg
    - (0.2 * hwAvg)
    - (0.6 * examAvg))
    /0.2;
    System.out.println("Given an homework average of " + hwAvg
    + " and an exam average of " + examAvg
    + " you need a score of " + requiredFinalScore
    + " to get a final course average of " + targetAvg);
  }
}

// The line on the right is the limit for 80 charas
