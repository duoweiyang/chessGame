import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {
    Random rand = new Random();
    int secretNumber = rand.nextInt(10) + 1; // an integer from 0 - 10 if you don't have + 1, exclusive (10 is not in the range)
    boolean guessedCorrectly = false;
    while (!guessedCorrectly) {
      //get user input
      Scanner s = new Scanner(System.in);
      String input = s.next();
      int guess = Integer.parseInt(input);
      if (guess == secretNumber) {
        guessedCorrectly = true;
        System.out.println("Correct!");
      } else {
        System.out.println("Wrong. Try again.");
      }
    }
    //System.out.println(System.currentTimeMillis()); // integral time that can represent integers more than twice for int
    //System.out.println();
    //System.out.println(secretNumber);

  }
}
