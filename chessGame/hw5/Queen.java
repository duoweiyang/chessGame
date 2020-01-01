/**
 * Represents a Queen piece on the chessboard
 *
 * @author dyang305
 * @version 1.0
 */
public class Queen extends Piece {

    /**
     * Takes in chess piece color
     *
     * @param c of chess piece
     */
    public Queen(Color c) {
        super(c);
    }

    /**
     * @return algebraic name of chess piece
     */
    public String algebraicName() {
        return "Q";
    }

    /**
     * @return fen name of chess piece
     */
    public String fenName() {
        return getColor() == Color.WHITE ? "Q" : "q";
    }

    /**
     * Indicates where a Bishop can go on the chessboard.
     *
     * @param square current position of piece
     * @return array of the squares the piece can go to.
     *
     */
    public Square[] movesFrom(Square square) {
        Square[] sq = new Square[64];
        int counter = 0;
        char rank = square.getRank();
        char file = square.getFile();

        for (int i = 1; i <= 8; i++) {
            char[] ranks = new char[]{(char) (rank + i), (char) (rank - i)};
            char[] files = new char[]{(char) (file + i), (char) (file - i)};
            if (isInBoard(files[0], ranks[0])) {
                sq[counter++] = new Square(files[0], ranks[0]);
            }
            if (isInBoard(files[1], ranks[0])) {
                sq[counter++] = new Square(files[1], ranks[0]);
            }
            if (isInBoard(files[0], ranks[1])) {
                sq[counter++] = new Square(files[0], ranks[1]);
            }
            if (isInBoard(files[1], ranks[1])) {
                sq[counter++] = new Square(files[1], ranks[1]);
            }
            if (isInBoard(files[0], rank)) {
                sq[counter++] = new Square(files[0], rank);
            }
            if (isInBoard(files[1], rank)) {
                sq[counter++] = new Square(files[1], rank);
            }
            if (isInBoard(file, ranks[0])) {
                sq[counter++] = new Square(file, ranks[0]);
            }
            if (isInBoard(file, ranks[1])) {
                sq[counter++] = new Square(file, ranks[1]);
            }
        }

        Square[] full = new Square[counter];
        for (int i = 0; i < counter; i++) {
            full[i] = sq[i];
        }

        return full;
    }
}