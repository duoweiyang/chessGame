/**
 * Represents a King piece on the chessboard
 *
 * @author dyang305
 * @version 1.0
 */

public class King extends Piece {

    /**
     * Takes in chess piece color
     *
     * @param color of chess piece
     */
    public King(Color color) {
      super(color);
    }

    @Override
    public String algebraicName() {
        return "K";
    }

    @Override
    public String fenName() {
        if (color.equals(Color.BLACK)) {
            return "k";
        } else {
            return "K";
        }
    }

    @Override
  public Square[] movesFrom(Square square) {
        Square s = square;
        char file = s.getFile();
        char rank = s.getRank();
        int intRank = Character.getNumericValue(rank);
        int f = (int) file;
        int r = (int) rank;
        Square[] moves;

        if (f == 'a') {
            if (intRank > 1 && intRank < 8) {
                moves = new Square[5];
                moves[0] = new Square((char) (f), (char) (r + 1));
                moves[1] = new Square((char) (f + 1), (char) (r + 1));
                moves[2] = new Square((char) (f + 1), (char) r);
                moves[3] = new Square((char) (f + 1), (char) (r - 1));
                moves[4] = new Square((char) f, (char) (r - 1));
            } else if (intRank == 1) {
                moves = new Square[3];
                moves[0] = new Square((char) (f), (char) (r + 1));
                moves[1] = new Square((char) (f + 1), (char) (r + 1));
                moves[2] = new Square((char) (f + 1), (char) (r));
            } else {
                moves = new Square[3];
                moves[0] = new Square((char) (f + 1), (char) (r));
                moves[1] = new Square((char) (f + 1), (char) (r - 1));
                moves[2] = new Square((char) (f), (char) (r - 1));
            }
        } else if (f == 'h') {
            if (intRank > 1 && intRank < 8) {
                moves = new Square[5];
                moves[0] = new Square((char) (f), (char) (r - 1));
                moves[1] = new Square((char) (f - 1), (char) (r - 1));
                moves[2] = new Square((char) (f - 1), (char) (r));
                moves[3] = new Square((char) (f - 1), (char) (r + 1));
                moves[4] = new Square((char) (f), (char) (r + 1));
            } else if (intRank == 1) {
                moves = new Square[3];
                moves[0] = new Square((char) (f), (char) (r + 1));
                moves[1] = new Square((char) (f - 1), (char) (r + 1));
                moves[2] = new Square((char) (f - 1), (char) (r));
            } else {
                moves = new Square[3];
                moves[0] = new Square((char) (f - 1), (char) (r));
                moves[1] = new Square((char) (f - 1), (char) (r - 1));
                moves[2] = new Square((char) (f), (char) (r - 1));
            }
        } else {
            moves = new Square[8];
            moves[0] = new Square((char) (f + 1), (char) (r));
            moves[1] = new Square((char) (f - 1), (char) (r));
            moves[2] = new Square((char) (f), (char) (r + 1));
            moves[3] = new Square((char) (f), (char) (r - 1));
            moves[4] = new Square((char) (f + 1), (char) (r + 1)); //diagonals
            moves[5] = new Square((char) (f + 1), (char) (r - 1));
            moves[6] = new Square((char) (f - 1), (char) (r + 1));
            moves[7] = new Square((char) (f - 1), (char) (r - 1));
        }
        return moves;
    }
}
