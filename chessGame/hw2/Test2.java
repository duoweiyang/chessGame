import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {
    Piece knight = new Knight(Color.BLACK);
    Square[] attackedSquares = knight.movesFrom(new Square("a8"));
    assert knight.fenName().equals("n");
    // test that attackedSquares contains e8, g8, etc.
    Square a1 = new Square("a1");
    Square otherA1 = new Square('a', '1');
    Square h8 = new Square("h8");
    System.out.println(Arrays.toString(attackedSquares));
    System.out.println(knight.fenName().equals("n"));

    Piece king = new King(Color.BLACK);
    Square[] attackedSquares2 = king.movesFrom(new Square("a1"));
    // test that attackedSquares contains e8, g8, etc.
    System.out.println(Arrays.toString(attackedSquares2));
    System.out.println(king.fenName().equals("k"));

    Piece rook = new Rook(Color.WHITE);
    Square[] attackedSquares3 = rook.movesFrom(new Square("b3"));
    // test that attackedSquares contains e8, g8, etc.
    System.out.println(Arrays.toString(attackedSquares3));
    System.out.println(rook.fenName().equals("R"));
  }
}
