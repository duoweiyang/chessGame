/**
 * Represents the squares on a chessboard.
 *
 * @author dyang305
 * @version 1.0
 */

public class Square {

    private char file;
    private char rank;
    private String name;

    /**
     * Constructor for chess square's position.
     * @param file the file name (i.e. a)
     * @param rank the rank name (i.e. 1)
     * @exception InvalidSquareException if square given is invalid.
     */
    public Square(char file, char rank) throws InvalidSquareException {
        if ((int) file >= 97 && (int) file <= 104) {
            if ((int) rank >= 49 && (int) rank <= 56) {
                this.file = file;
                this.rank = rank;
            } else {
                throw new InvalidSquareException("" + file + rank);
            }
        } else {
            throw new InvalidSquareException("" + file + rank);
        }
    }

    /**
     * Another constructor for chess square's position.
     * @param name of chess square (i.e. a1)
     */
    public Square(String name) throws InvalidSquareException {
      this(name.charAt(0), name.charAt(1));
        if (name.length() != 2) {
            throw new InvalidSquareException(name);
        }
        if (!((int) file >= 97 && (int) file <= 104)) {
            throw new InvalidSquareException(name);
        }
        if (!((int) rank >= 49 && (int) rank <= 56)) {
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
     * @param file (in char)
     */
    public void setFile(char file) {
        this.file = file;
    }

    /**
     * @param rank (in char)
     */
    public void setRank(char rank) {
        this.rank = rank;
    }

    /**
     * If chess position is already combined as a String (i.e. d4), it's fine
     * Otherwise, add file and rank together and convert to String
     *
     * @return position of chess piece as a String
     */
    public String toString() {
        if (name != null) {
            return name;
        } else {
            String result = "" + file + rank;
            return result;
        }
    }

    @Override
  public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (!(o instanceof Square)) {
            return false;
        }

        Square c = (Square) o;

        return ((rank == c.rank) && (file == c.file));
    }
}
