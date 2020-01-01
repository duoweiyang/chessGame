import java.util.Arrays;

public class Dealer {
  public static void main(String[] args) {
    Card c = new Card("ace", "spades");    //c is a variable of type Card
    Card c2 = new Card("queen", "hearts");
    Card[] hand = {c, c2};
    System.out.println(hand[0]);
    System.out.println(hand[1]);
  }
}
