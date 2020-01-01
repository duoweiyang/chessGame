/**
 * Represents the template for a chess piece
 *
 * @author dyang305
 * @version 1.0
 */

public abstract class Piece {

    private String algebraName;
    protected Color color;

    /**
     * Creates a chess piece with designated color.
     * @param color of piece (Color type)
     */
    public Piece(Color color) {
        this.color = color;
    }

    /**
     * @return color of chess piece
     */
    public Color getColor() {
        return color;
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

}
