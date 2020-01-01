/**
 * Represents one turn of chess, both White's Ply and Black's Ply.
 *
 * @author dyang305
 * @version 1.0
 */
public class Move {
    private Ply whitePly;
    private Ply blackPly;

    /**
     * Constructor for one player's turn in chess.
     *
     * @param whitePly one move for white
     * @param blackPly one move for black
     *
     */
    public Move(Ply whitePly, Ply blackPly) {
        this.whitePly = whitePly;
        this.blackPly = blackPly;
    }

    /**
     * @return white's move.
     */
    public Ply getWhitePly() {
        return whitePly;
    }

    /**
     * @return black's move.
     */
    public Ply getBlackPly() {
        return blackPly;
    }
}
