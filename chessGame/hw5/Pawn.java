/**
 * Represents a Pawn piece on the chessboard
 *
 * @author dyang305
 * @version 1.0
 */
public class Pawn extends Piece {

    /**
     * Takes in chess piece color
     *
     * @param c of chess piece
     */
    public Pawn(Color c) {
        super(c);
    }

    /**
     * @return algebraic name of chess piece
     */
    public String algebraicName() {
        return "";
    }

    /**
     * @return fen name of chess piece
     */
    public String fenName() {
        return getColor() == Color.WHITE ? "P" : "p";
    }

    /**
     * Indicates where a Bishop can go on the chessboard.
     *
     * @param square current position of piece
     * @return array of the squares the piece can go to.
     *
     */
    public Square[] movesFrom(Square square) {
        char rank = square.getRank();
        char file = square.getFile();
        if (getColor() == Color.WHITE) {
            if (rank == '8') {
                return new Square[0];
            } else if (rank == '2') {
                return new Square[]{new Square(file, '4'),
                    new Square(file, '3')};
            } else {
                return new Square[]{new Square(file, (char) (rank + 1))};
            }
        } else {
            if (rank == '1') {
                return new Square[0];
            } else if (rank == '7') {
                return new Square[]{new Square(file, '5'),
                    new Square(file, '6')};
            } else {
                return new Square[]{new Square(file, (char) (rank - 1))};
            }
        }
    }
}
