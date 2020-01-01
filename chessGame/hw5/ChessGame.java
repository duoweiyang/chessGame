import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Represents a sequence of Moves.
 *
 * @author dyang305
 * @version 1.0
 */
public class ChessGame {
    private List<Move> moves;

    /**
     * Constructor for chess moves.
     * @param moves list of elements of type Move
     *
     */
    public ChessGame(List<Move> moves) {
        this.moves = moves;
    }

    /**
     * @return chess move
     */
    public List<Move> getMoves() {
        return moves;
    }

    /**
     * Finds what the nth move is.
     *
     * @param n the number input for the nth move
     * @return the nth move
     *
     */
    public Move getMove(int n) {
        return moves.get(n);
    }

    /**
     * Makes a list that has elements that are filtered by Predicate.
     *
     * @param filter a Move that's gone through Predicate methods
     * @return a list filtered by the predicate.
     *
     */
    public List<Move> filter(Predicate<Move> filter) {
        ArrayList<Move> result = new ArrayList();
        for (Move move : moves) {
            if (filter.test(move)) {
                result.add(move);
            }
        }
        return result;
    }

    /**
     * Makes a list that has moves with comments.
     *
     * @return a list of moves with comments
     *
     */
    public List<Move> getMovesWithComment() {
        return filter(x -> x.getWhitePly().getComment().isPresent()
        || x.getBlackPly().getComment().isPresent());
    }

    /**
     * Makes a list that has moves without comments.
     *
     * @return a list of moves without comments.
     *
     */
    public List<Move> getMovesWithoutComment() {
        return filter(new Predicate<Move>() {
            public boolean test(Move x) {
                return !((x.getWhitePly().getComment().isPresent()
                    || (x.getBlackPly().getComment().isPresent())));
            }
        });
    }

    /**
     * The inner class for getMovesWithPiece.
     *
     * @return a boolean on if this piece is the same as the inputted move.
     *
     */
    public class PiecePredicate implements Predicate<Move> {
        private Piece p;

        /**
         * Constructor for chess piece.
         *
         * @param p the chess piece
         *
         */
        public PiecePredicate(Piece p) {
            this.p = p;
        }

        /**
         * Makes a list that has elements that are filtered by Predicate.
         *
         * @param x the move
         * @return a boolean on whether p's algebraicName is the same as x's.
         *
         */
        public boolean test(Move x) {
            return (p.algebraicName().equals(x.getWhitePly().getPiece()
            .algebraicName())
                || p.algebraicName().equals(x.getBlackPly().getPiece()
            .algebraicName()));
        }
    }

    /**
     * The inner class for getMovesWithPiece.
     *
     * @param p A chess piece.
     * @return a list of moves with a piece of this type.
     *
     */
    public List<Move> getMovesWithPiece(Piece p) {
        return filter(new PiecePredicate(p));
    }
}
