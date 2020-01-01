import java.util.Optional;

/**
 * Represents one player's move in chess. A sort of half a move.
 *
 * @author dyang305
 * @version 1.0
 */
public class Ply {
    private Piece piece;
    private Square from;
    private Square to;
    private Optional<String> comment;

    /**
     * Constructor for chess move attributes.
     *
     * @param piece the type of chess piece
     * @param from where the piece is moving from
     * @param to where the piece is moving to
     * @param comment a literal comment
     *
     */
    public Ply(Piece piece, Square from, Square to, Optional<String> comment) {
        this.piece = piece;
        this.from = from;
        this.to = to;
        this.comment = comment;
    }

    /**
     * @return chess piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * @return where chess piece is coming from
     */
    public Square getFrom() {
        return from;
    }

    /**
     * @return where chess piece is going
     */
    public Square getTo() {
        return to;
    }

    /**
     * @return the comment that comes with the move
     */
    public Optional<String> getComment() {
        return comment;
    }
}
