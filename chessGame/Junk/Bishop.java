public class Bishop extends Piece {

  public Bishop(Color color) {
    super(color);
  }

  @Override
  public String algebraicName() {
    return "B";
  }

  @Override
  public String fenName() {
    if (color.equals(Color.BLACK)) {
      return "b";
    }
    else {
      return "B";
    }
  }

  @Override
  public Square[] movesFrom(Square square) {
    Square s = square;
    char file = s.getFile();
    char rank = s.getRank();
    int f = (int)file;
    int r = (int)rank;

    int unit;
    int letter;
    int num;

    Square[] moves;
    moves = new Square[8];
    for (unit = 0, letter = 97, num = 49; unit < 8; unit++, letter++, num++) {
      moves[unit] = new Square((char)(letter), (char)(num));
    }
    return moves;
  }
}
