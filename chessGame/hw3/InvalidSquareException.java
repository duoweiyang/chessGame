/**
 * An exception that deals with an invalid chess square input.
 *
 * This should be a checked exception because we're dealing with expected
 * error conditions that have to be handled programmatically. Someone is
 * entering an invalid input out of the immediate control of the program.
 *
 * @author dyang305
 */
public class InvalidSquareException extends Exception {
    public InvalidSquareException() {
    }

    public InvalidSquareException(String square) {
    super(square);
    }
}
