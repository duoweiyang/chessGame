public class Queen extends Piece {

  @Override
  public Queen(Color color) {
    super(color);
  }

  @Override
  public algebraicName() {
    return "Q"
  }

  @Override
  public fenName() {
    return "Q"
  }

  @Override
  public String[] movesFrom(Square square) {
    char file = Square.getFile()
    char rank = Square.getRank()
    // Make new variables for file and rank so you can char --> int --> char
    Square[] moves;
  }

  public String[] 

}
