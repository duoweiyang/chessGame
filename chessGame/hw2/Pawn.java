/**
 * Represents a pawn on the chessboard
 *
 * @author dyang305
 * @version 1.0
 */

public class Pawn extends Piece {

    /**
     * Takes in chess piece color
     *
     * @param color of chess piece
     */
    public Pawn(Color color) {
    super(color);
    }

    @Override
  public String algebraicName() {
        return "";
    }

    @Override
  public String fenName() {
        if (color.equals(Color.BLACK)) {
            return "p";
        } else {
            return "P";
        }
    }

    @Override
    public Square[] movesFrom(Square square) {
        Square s = square;
        char file = s.getFile();
        char rank = s.getRank();
        int f = (int) file;
        int r = (int) rank;
        Square[] moves;
        // Make new variables for file and rank so you can char --> int --> char
        if (color.equals(Color.WHITE)) {
            if (rank == '2') { // add if-white conditional, else is black
                moves = new Square[2];
                moves[0] = new Square((char) (f), (char) (r + 1));
                moves[1] = new Square((char) (f), (char) (r + 2));
            } else if (rank >= '8') {
                moves = new Square[0];
                return moves;
            } else {
                moves = new Square[1];
                moves[0] = new Square((char) (f), (char) (r + 1));
            }
        } else {
            if (rank == '7') {
                moves = new Square[2];
                moves[0] = new Square((char) (f), (char) (r - 1));
                moves[1] = new Square((char) (f), (char) (r - 2));
            } else if (rank <= '1') {
                moves = new Square[0];
                return moves;
            } else {
                moves = new Square[1];
                moves[0] = new Square((char) (f), (char) (r - 1));
            }
        }
        return moves;
    }
}
