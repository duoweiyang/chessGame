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
     * @param c of chess piece
     */
    public King(Color c) {
        super(c);
    }

    /**
     * @return algebraic name of chess piece
     */
    public String algebraicName() {
        return "K";
    }

    /**
     * @return fen name of chess piece
     */
    public String fenName() {
        return getColor() == Color.WHITE ? "K" : "k";
    }

    /**
     * Indicates where a King can go on the chessboard.
     *
     * @param square current position of piece
     * @return array of the squares the piece can go to.
     *
     */
    public Square[] movesFrom(Square square) {
        Square[] sq = new Square[8];
        int counter = 0;
        char rank = square.getRank();
        char file = square.getFile();
        for (int r = -1; r <= 1; r++) {
            for (int c = -1; c <= 1; c++) {
                if (r == 0 && c == 0) {
                    continue;
                }
                if (isInBoard((char) (file + c), (char) (rank + r))) {
                    sq[counter++] = new Square((char) (file + c),
                    (char) (rank + r));
                }
            }
        }

        Square[] full = new Square[counter];
        for (int i = 0; i < counter; i++) {
            full[i] = sq[i];
        }

        return full;
    }
}
