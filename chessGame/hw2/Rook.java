/**
 * Represents a rook on the chessboard
 *
 * @author dyang305
 * @version 1.0
 */

public class Rook extends Piece {

    /**
     * Takes in chess piece color
     *
     * @param color of chess piece
     */
    public Rook(Color color) {
    super(color);
    }

    @Override
  public String algebraicName() {
        return "R";
    }

    @Override
  public String fenName() {
        if (color.equals(Color.BLACK)) {
            return "r";
        } else {
            return "R";
        }
    }

    @Override
  public Square[] movesFrom(Square square) {
        Square s = square;
        char file = s.getFile();
        char rank = s.getRank();
        int f = (int) file;
        int r = (int) rank;

        int counter = 0;

        Square[] moves;
        moves = new Square[14];
        for (int unit = 0, letter = f, num = 49; unit < 8; unit++, num++) {
            if (!(letter == f && num == r)) {
                moves[unit - counter] = new Square((char) (letter), (char)
                (num));
            } else {
                counter++;
            }
        }
        for (int unit = 8, letter = 97, num = r; unit < 16; unit++, letter++) {
            if (!(letter == f && num == r)) {
                moves[unit - counter] = new Square((char) (letter), (char)
                (num));
            } else {
                counter++;
            }
        }
        return moves;
    }
}
