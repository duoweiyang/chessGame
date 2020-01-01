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
     */
    public Square(char file, char rank) {
        this.file = file;
        this.rank = rank;
    }

    /**
     * Another constructor for chess square's position.
     * @param name of chess square (i.e. a1)
     */
    public Square(String name) {
        this.name = name;
        file = name.charAt(0); //file
        rank = name.charAt(1); //rank
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
