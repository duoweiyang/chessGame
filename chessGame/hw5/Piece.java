/**
 * Represents the template for a chess piece
 *
 * @author dyang305
 * @version 1.0
 */
public abstract class Piece {

    private Color color;

    /**
     * Creates a chess piece with designated color.
     *
     * @param c of piece (Color type)
     */
    public Piece(Color c) {
        color = c;
    }

    /**
     * @return color of chess piece
     */
    public Color getColor() {
        return color;
    }

    /**
     *
     * @param file the file name (i.e. a)
     * @param rank the rank name (i.e. 1)
     *
     * @return whether or not the move is legally on the board
     */
    public boolean isInBoard(char file, char rank) {
        return file >= 'a' && file <= 'h' && rank >= '1' && rank <= '8';
    }

    /**
     * @return algebraic name as a String
     */
    public abstract String algebraicName();

    /**
     * @return FEN name as a String
     */
    public abstract String fenName();

    /**
     * @param square the current position of the chess piece
     * @return array of all squares the piece could move to
     */
    public abstract Square[] movesFrom(Square square);

    /**
     * Makes qualities of piece into String.
     *
     * @return piece attributes
     */
    public String toString() {
        return color.toString() + " " + this.getClass();
    }
}
