/**
 * Represents the squares on a chessboard.
 *
 * @author dyang305
 * @version 1.1
 */
public class Square {

    private char rank;
    private char file;
    private String name;

    /**
     * Constructor for chess square's position.
     * @param file the file name (i.e. a)
     * @param rank the rank name (i.e. 1)
     */
    public Square(char file, char rank) {
        this("" + file + rank);
    }

    /**
     * Another constructor for chess square's position.
     * @param name of chess square (i.e. a1)
     */
    public Square(String name) {
        this.name = name;
        if (name != null && name.length() == 2) {
            file = name.charAt(0);
            rank = name.charAt(1);
            if (file >= 'a' && file <= 'h' && rank >= '1' && rank <= '8') {
                this.name = name;

            } else {
                throw new InvalidSquareException(name);
            }
        } else {
            throw new InvalidSquareException(name);
        }
    }

    /**
     * @return the file for chess square's position
     */
    public char getFile() {
        return file;
    }

    /**
     * @return the rank for chess square's position
     */
    public char getRank() {
        return rank;
    }

    /**
     * If chess position is already combined as a String (i.e. d4), it's fine
     * Otherwise, add file and rank together and convert to String
     *
     * @return position of chess piece as a String
     */
    public String toString() {
        return name;
    }

    /**
     * Overriding equals method.
     * @param o Object we're comparing to
     *
     * @return rank the rank name (i.e. 1)
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square that = (Square) o;
            return that.rank == rank && that.file == file;
        } else {
            return false;
        }
    }
    /**
     * Indicates whether some object is "equal to" this one.
     *
     * @return a hash code value for the object.
     */
    @Override
 public int hashCode() {
        return (int) this.rank * 13 + this.file * 17;
    }
}
