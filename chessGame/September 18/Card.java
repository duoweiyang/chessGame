public class Card {
  private String rank;
  private String suit;

  public Card(String rank, String suit) {
    setRank(rank);
    setSuit(suit);
  }

  public static final String[] validRanks =
        {"2", "3", "4", "5", "6", "7", "8", "9",
         "10", "jack", "queen", "king", "ace"};
  public static final String[] validSuits = {"hearts", "clubs", "spades", "diamonds"};

  public void setRank(String rank) {
    if (contains(validRanks, rank)) {
      this.rank = rank;
    } else {
        System.out.printf("Invalid rank: %s%n", rank);
        System.exit(1);
    }
  }

  public void setSuit(String suit) {
    if (contains(validSuits, suit)) {
      this.rank = rank;
    } else {
        System.out.printf("Invalid suit: %s%n", suit);
        System.exit(1);
    }
  }

}


// You can put a main method in any class
// return String.format("%s of %s", rank, suit); returns null of null if rank and suit are not assigned values.
// Making something private means that we can only access these in the card class, so using c.blank in another class will not compile
// Dealer is collaborating with the Card class to do stuff
