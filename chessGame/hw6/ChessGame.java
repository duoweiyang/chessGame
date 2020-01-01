import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Represents the information from a PGN file.
 *
 * @author dyang305
 * @version 1.0
 */
public class ChessGame {

    private StringProperty event = new SimpleStringProperty(this, "NA");
    private StringProperty site = new SimpleStringProperty(this, "NA");
    private StringProperty date = new SimpleStringProperty(this, "NA");
    private StringProperty white = new SimpleStringProperty(this, "NA");
    private StringProperty black = new SimpleStringProperty(this, "NA");
    private StringProperty result = new SimpleStringProperty(this, "NA");
    private List<String> moves;

    /**
     * Constructor for PGN file attributes.
     *
     * @param event the tournament
     * @param site where the game happened
     * @param date when the game happened
     * @param white the person playing as white
     * @param black the person playing as black
     * @param result who won the game
     *
     */
    public ChessGame(String event, String site, String date,
                     String white, String black, String result) {
        this.event.set(event);
        this.site.set(site);
        this.date.set(date);
        this.white.set(white);
        this.black.set(black);
        this.result.set(result);
        moves = new ArrayList<>();
    }

    /**
     * Adds each move to an arraylist.
     *
     * @param move Each chess move from the game
     */
    public void addMove(String move) {
        moves.add(move);
    }

    /**
     * Gets a single move from the game.
     *
     * @param n the number input for the nth move
     * @return the nth move
     *
     */
    public String getMove(int n) {
        return moves.get(n - 1);
    }

    /**
     * Gets event from the game.
     *
     * @return the nth move
     *
     */
    public String getEvent() {
        return event.get();
    }

    /**
     * Gets site from the game.
     *
     * @return site
     *
     */
    public String getSite() {
        return site.get();
    }

    /**
     * Gets date of the game.
     *
     * @return date
     *
     */
    public String getDate() {
        return date.get();
    }

    /**
     * Gets name of person playing as white from the game.
     *
     * @return the name
     *
     */
    public String getWhite() {
        return white.get();
    }

    /**
     * Gets name of person playing as black from the game.
     *
     * @return the name
     *
     */
    public String getBlack() {
        return black.get();
    }

    /**
     * Gets result of the game.
     *
     * @return result of the game
     *
     */
    public String getResult() {
        return result.get();
    }
}
