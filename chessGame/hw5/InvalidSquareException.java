/**
 * @author dyang305
 * @version 1.1
 */

public class InvalidSquareException extends RuntimeException {

  /**
   * No-arg constructor that creates InvalidSquareException.
   */
    public InvalidSquareException() {
    }

    /**
     * Constructor that creates InvalidSquareException.
     *
     * @param square a chess square (i.e. a1)
     */
    public InvalidSquareException(String square) {
    super(square);
    }

    /**
     * Constructor that creates InvalidSquareException.
     *
     * @param square a chess square (i.e. a1)
     */
    public InvalidSquareException(Square square) {
      this(square.toString());
    }
}
