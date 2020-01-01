import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PgnReader {

    /**
     * Find the tagName tag pair in a PGN game and return its value.
     *
     * @see http://www.saremba.de/chessgml/standards/pgn/pgn-complete.htm
     *
     * @param tagName the name of the tag whose value you want
     * @param game a `String` containing the PGN text of a chess game
     * @return the value in the named tag pair
     */
    public static String tagValue(String tagName, String game) {
        if (game.contains(tagName)) {
            int first = game.indexOf(tagName);
            int extra = tagName.length();
            first += extra;
            first += 2;
            int last = game.indexOf("]", first);
            last -= 1;
            String result = game.substring(first, last);
            return result;
        } else {
            return "NOT GIVEN";
        }
    }

    /**
     * Play out the moves in game and return a String with the game's
     * final position in Forsyth-Edwards Notation (FEN).
     *
     * @see http://www.saremba.de/chessgml/standards/pgn/pgn-complete.htm#c16.1
     *
     * @param game a `String` containing a PGN-formatted chess game or opening
     * @return the game's final position in FEN.
     */

    private static String[][] board = {
        {"r", "n", "b", "q", "k", "b", "n", "r"},
        {"p", "p", "p", "p", "p", "p", "p", "p"},
        {"", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", ""},
        {"P", "P", "P", "P", "P", "P", "P", "P"},
        {"R", "N", "B", "Q", "K", "B", "N", "R"}
    };
    private static String[][] coordinates = {
        {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
        {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
        {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
        {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
        {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
        {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
        {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
        {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}
    };

    public static String finalPosition(String game) {
        String originalStr;
        originalStr = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";
        return "I'm sorry";
    }
/* GARBAGE
    public static String gameSplit2(String game) {
        String oneMove;
        String[] moves = gameSplit(game);
        for (int i = 0; i < moves.length; i++) {
          if (!moves[i].equals("")) {           // ignore empty arrays
            oneMove = moves[i];
            return oneMove;
            //movePiece(board, coordinates, moves[i])
            }
          }
        }

    public static void movePiece(String[][] board, String[][] coordinates,
    String game) {
      String oneMove = gameSplit2(game);
      for (int count = 0; count < gameSplit(game).length; ++count) {
        if (oneMove.charAt(0) == 'K') {
          if (count == 0 || count % 2 == 0) {
            String position = oneMove.substring(1, 2);
            int initialColumn = 0;
            int initialRow = 0;

            for (int col = 0; col < board[0].length; ++col) {
              for (int row = 0; row < coordinates[0].length; ++col) {
                if (board[col][row].equals("K")) {
                  //Initial position
                  initialColumn = col;
                  initialRow = row;
              }
            }
          }

            for (int col = 0; col < board[0].length; ++col) {
              for (int row = 0; row < coordinates[0].length; ++col) {
                  if (position.equals(coordinates[col][row])) {
                        board[col][row] = "K";            //K moves to new space
                        board[initialColumn][initialRow] = ""; //Old spot empty
                      }
                    }
                  }
                }
                else {
                  String position = oneMove.substring(1, 2);
                  int initialColumn = 0;
                  int initialRow = 0;

                  for (int col = 0; col < board[0].length; ++col) {
                    for (int row = 0; row < coordinates[0].length; ++col) {
                      if (board[col][row].equals("k")) {
                        //Initial position
                        initialColumn = col;
                        initialRow = row;
              }
            }
          }

            for (int col = 0; col < board[0].length; ++col) {
              for (int row = 0; row < coordinates[0].length; ++col) {
                  if (position.equals(coordinates[col][row])) {
                        board[col][row] = "k";                   //K - new space
                        board[initialColumn][initialRow] = "";   //Old spot ""
                      }
                    }
                  }
                }
              }

        else if (oneMove.charAt(0) == 'Q') {
          System.out.println("Queen");
        }

        else if (oneMove.charAt(0) == 'B') {
          System.out.println("Bishop");

        }
        else if (oneMove.charAt(0) == 'N') {
          System.out.println("Knight");
        }
        else if (oneMove.charAt(0) == 'R') {
          System.out.println("Rook");
        }
        else {
          System.out.println("Pawn");
        }
      }
    }

*/

    public static String[] gameSplit(String game) {
        String positions = game.substring(game.indexOf("1."));
        String[] moves = positions.split("\\s*\\d+\\.\\s*|\\s|\\d-\\d");
        return moves;
    }


      /*  Check if first letter is captalized. If not, it's a pawn.
      // move and replace

    /* GARBAGE
        public static int convertToNum(char piece) {
          switch (piece) {
            case ('a'): return 0;
            break;
            case ('b'): return 1;
            break;
            case ('c'): return 2;
            break;
            case ('d'): return 3;
            break;
            case ('e'): return 4;
            break;
            case ('f'): return 5;
            break;
            case ('g'): return 6;
            break;
            case ('h'): return 7;
            break;
          }
        }

        public static void readMoveX(String oneMove, char piece) {
          if (Character.toUpperCase(piece) == "P")) {
            char letter = oneMove.charAt(0);
            int initialColumn = convertToNum(letter);
            return initialColumn;
            }
          else {
              char letter = oneMove.charAt(1);
              if ()
              int initialColumn = convertToNum(letter);
          }
        }

        public static void readMoveY(String oneMove, char piece) {
          if (Character.toUpperCase(piece) == "P")) {
            char num = oneMove.charAt(1);
            int initialRow = Character.getNumericValue(num);
            initialRow--;
            return initialRow;
    */

    /**
     * Reads the file named by path and returns its content as a String.
     *
     * @param path the relative or absolute path of the file to read
     * @return a String containing the content of the file
     */
    public static String fileContent(String path) {
        Path file = Paths.get(path);
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                // Add the \n that's removed by readline()
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            System.exit(1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String game = fileContent(args[0]);
        System.out.format("Event: %s%n", tagValue("Event", game));
        System.out.format("Site: %s%n", tagValue("Site", game));
        System.out.format("Date: %s%n", tagValue("Date", game));
        System.out.format("Round: %s%n", tagValue("Round", game));
        System.out.format("White: %s%n", tagValue("White", game));
        System.out.format("Black: %s%n", tagValue("Black", game));
        System.out.format("Result: %s%n", tagValue("Result", game));
        System.out.println("Final Position:");
        System.out.println(finalPosition(game));
    }
}
