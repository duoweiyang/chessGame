/**
 * Represents a Knight piece on the chessboard
 *
 * @author dyang305
 * @version 1.0
 */

public class Knight extends Piece {

    /**
     * Takes in chess piece color
     *
     * @param color of chess piece
     */
    public Knight(Color color) {
    super(color);
    }

    @Override
  public String algebraicName() {
        return "N";
    }

    @Override
  public String fenName() {
        if (color.equals(Color.BLACK)) {
            return "n";
        } else {
            return "N";
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
        // Make new variables for file and rank so you can char --> int --> char

        if (file == 'a') {
            if (intRank > 2 && intRank < 7) {
                moves = new Square[4];
                moves[0] = new Square((char) (f + 1), (char) (r + 2));
                moves[1] = new Square((char) (f + 2), (char) (r + 1));
                moves[2] = new Square((char) (f + 2), (char) (r - 1));
                moves[3] = new Square((char) (f + 1), (char) (r - 2));
            } else if (intRank == 1) {
                moves = new Square[2];
                moves[0] = new Square((char) (f + 1), (char) (r + 2));
                moves[1] = new Square((char) (f + 2), (char) (r + 1));
            } else if (intRank == 2) {
                moves = new Square[3];
                moves[0] = new Square((char) (f + 1), (char) (r + 2));
                moves[1] = new Square((char) (f + 2), (char) (r + 1));
                moves[2] = new Square((char) (f + 2), (char) (r - 1));
            } else if (intRank == 7) {
                moves = new Square[3];
                moves[0] = new Square((char) (f + 2), (char) (r + 1));
                moves[1] = new Square((char) (f + 2), (char) (r - 1));
                moves[2] = new Square((char) (f + 1), (char) (r - 2));
            } else {
                moves = new Square[2];
                moves[0] = new Square((char) (f + 2), (char) (r - 1));
                moves[1] = new Square((char) (f + 1), (char) (r - 2));
            }
        } else if (file == 'h') {
            if (intRank > 2 && intRank < 7) {
                moves = new Square[4];
                moves[0] = new Square((char) (f - 1), (char) (r + 2));
                moves[1] = new Square((char) (f - 2), (char) (r + 1));
                moves[2] = new Square((char) (f - 2), (char) (r - 1));
                moves[3] = new Square((char) (f - 1), (char) (r - 2));
            } else if (intRank == 1) {
                moves = new Square[2];
                moves[0] = new Square((char) (f - 1), (char) (r + 2));
                moves[1] = new Square((char) (f - 2), (char) (r + 1));
            } else if (intRank == 2) {
                moves = new Square[3];
                moves[0] = new Square((char) (f - 1), (char) (r + 2));
                moves[1] = new Square((char) (f - 2), (char) (r + 1));
                moves[2] = new Square((char) (f - 2), (char) (r - 1));
            } else if (intRank == 7) {
                moves = new Square[3];
                moves[0] = new Square((char) (f - 2), (char) (r + 1));
                moves[1] = new Square((char) (f - 2), (char) (r - 1));
                moves[2] = new Square((char) (f - 1), (char) (r - 2));
            } else {
                moves = new Square[2];
                moves[0] = new Square((char) (f - 2), (char) (r - 1));
                moves[1] = new Square((char) (f - 1), (char) (r - 2));
            }
        } else {
            moves = new Square[8];
            moves[0] = new Square((char) (f + 1), (char) (r + 2));
            moves[1] = new Square((char) (f + 2), (char) (r + 1));
            moves[2] = new Square((char) (f + 2), (char) (r - 1));
            moves[3] = new Square((char) (f + 1), (char) (r - 2));
            moves[4] = new Square((char) (f - 1), (char) (r - 2));
            moves[5] = new Square((char) (f - 2), (char) (r - 1));
            moves[6] = new Square((char) (f - 2), (char) (r + 1));
            moves[7] = new Square((char) (f - 1), (char) (r + 2));
        }
        return moves;
    }
}

/* Testing stuff
System.out.println(file);
System.out.println(rank);
System.out.println(f);
System.out.println(r);
System.out.println(intRank);
*/
