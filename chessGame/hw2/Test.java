import java.util.Arrays;
import java.util.Comparator;

/**
 * This is a tester class for the fall 2017 CS1331 HW2 assignment
 * It tests for all points that can be gained or lost
 * The test cases are not that exhaustive. I may update it in the
 * future. If you add your own feel free to post an updated file
 *
 * @author ssavelyev3
 */
public class Test {
    public static void main(String[] args) {
        testColor();
        System.out.println();
        testSquare();
        System.out.println();
        testPiece();
        System.out.println();
        testKing();
        System.out.println();
        testKnight();
        System.out.println();
        testRook();
        System.out.println();
        testPawn();
    }

    public static void testColor() {
        //5 points for Color existing
        Color whiteColor = Color.WHITE;
        Color blackColor = Color.BLACK;
    }

    public static void testSquare() {
        //5 points for char constructor
        Square a1 = new Square('a', '1');
        checkB(a1.toString().equals("a1"), "Square.toString()");
        try {
            Object a1Str = "a1";
            checkB(!a1.equals(a1Str), "Square.equals(String)");
        } catch (ClassCastException e) {
            System.err.println("Failed test: Square.equals(String)");
            System.err.println("\tReason: improperly written equals method");
            System.err.println("\thttp://cs1331.gatech.edu/slides/"
                               + "object-superclass.pdf");
            e.printStackTrace();
        }

        //5 points for String constructor
        Object a1String = new Square("a1");
        checkB(a1.equals(a1String), "Square.equals(Square)");
    }

    public static void testPiece() {
        //This is just checking for the ability to compile
        //It also checks that Piece is storing the color and not the other
        //classes
        Piece w = new Piece(Color.WHITE) {
                @Override
                public String algebraicName() {
                    return "algebraicName";
                }

                @Override
                public String fenName() {
                    return "fenName";
                }

                @Override
                public Square[] movesFrom(Square square) {
                    return new Square[0];
                }
            };
        Piece b = new Piece(Color.BLACK) {
                @Override
                    public String algebraicName() {
                    return "algebraicName";
                }

                @Override
                    public String fenName() {
                    return "fenName";
                }

                @Override
                    public Square[] movesFrom(Square square) {
                    return new Square[0];
                }
            };

        checkB(w.getColor() == Color.WHITE && b.getColor() == Color.BLACK,
               "Piece.getColor()");
        //These must compile
        w.algebraicName();
        w.fenName();
        w.movesFrom(new Square("a1"));
    }

    public static void testKing() {
        Piece kingW = new King(Color.WHITE);
        Piece kingB = new King(Color.BLACK);

        checkB(kingW.getColor() == Color.WHITE
               && kingB.getColor() == Color.BLACK , "King.getColor()");

        checkB(kingW.algebraicName().equals("K")
               && kingB.algebraicName().equals("K"),
               "King.algebraicName()");
        checkB(kingW.fenName().equals("K")
               && kingB.fenName().equals("k"), "King.fenName()");

        checkB(arraysContainSame(kingW.movesFrom(new Square("a1")),
                                 new Square[] {
                                     new Square("a2"),
                                     new Square("b1"),
                                     new Square("b2")
                                 })
               && arraysContainSame(kingW.movesFrom(new Square("h1")),
                                 new Square[] {
                                     new Square("h2"),
                                     new Square("g1"),
                                     new Square("g2")
                                 })
               && arraysContainSame(kingW.movesFrom(new Square("a8")),
                                 new Square[] {
                                     new Square("a7"),
                                     new Square("b8"),
                                     new Square("b7")
                                 })
               && arraysContainSame(kingW.movesFrom(new Square("b2")),
                                 new Square[] {
                                     new Square("a1"),
                                     new Square("a2"),
                                     new Square("a3"),
                                     new Square("b1"),
                                     new Square("b3"),
                                     new Square("c1"),
                                     new Square("c2"),
                                     new Square("c3")
                                 })
               && arraysContainSame(kingW.movesFrom(new Square("h8")),
                                 new Square[] {
                                     new Square("h7"),
                                     new Square("g8"),
                                     new Square("g7")
                                 }),
               "King.movesFrom(Square)");
    }

    public static void testKnight() {
        Piece w = new Knight(Color.WHITE);
        Piece b = new Knight(Color.BLACK);

        checkB(w.getColor() == Color.WHITE
               && b.getColor() == Color.BLACK , "Knight.getColor()");

        checkB(w.algebraicName().equals("N")
               && b.algebraicName().equals("N"),
               "Knight.algebraicName()");
        checkB(w.fenName().equals("N")
               && b.fenName().equals("n"), "Knight.fenName()");

        checkB(arraysContainSame(w.movesFrom(new Square("a1")),
                                 new Square[] {
                                     new Square("b3"),
                                     new Square("c2")
                                 })
               && arraysContainSame(w.movesFrom(new Square("a8")),
                                 new Square[] {
                                     new Square("b6"),
                                     new Square("c7")
                                 })
               && arraysContainSame(w.movesFrom(new Square("h1")),
                                 new Square[] {
                                     new Square("g3"),
                                     new Square("f2")
                                 })
               && arraysContainSame(w.movesFrom(new Square("h8")),
                                 new Square[] {
                                     new Square("g6"),
                                     new Square("f7")
                                 })
               && arraysContainSame(w.movesFrom(new Square("d3")),
                                 new Square[] {
                                     new Square("c1"),
                                     new Square("e1"),
                                     new Square("b2"),
                                     new Square("f2"),
                                     new Square("b4"),
                                     new Square("f4"),
                                     new Square("c5"),
                                     new Square("e5")
                                 }),
               "Knight.movesFrom(Square)");
    }

    public static void testRook() {
           Piece w = new Rook(Color.WHITE);
           Piece b = new Rook(Color.BLACK);

           checkB(w.getColor() == Color.WHITE
                  && b.getColor() == Color.BLACK , "Rook.getColor()");

           checkB(w.algebraicName().equals("R")
                  && b.algebraicName().equals("R"),
                  "Rook.algebraicName()");
           checkB(w.fenName().equals("R")
                  && b.fenName().equals("r"), "Rook.fenName()");

           checkB(arraysContainSame(w.movesFrom(new Square("a1")),
                                    new Square[] {
                                        new Square("a2"),
                                        new Square("a3"),
                                        new Square("a4"),
                                        new Square("a5"),
                                        new Square("a6"),
                                        new Square("a7"),
                                        new Square("a8"),
                                        new Square("b1"),
                                        new Square("c1"),
                                        new Square("d1"),
                                        new Square("e1"),
                                        new Square("f1"),
                                        new Square("g1"),
                                        new Square("h1")
                                    })
                  && arraysContainSame(w.movesFrom(new Square("d3")),
                                    new Square[] {
                                        new Square("a3"),
                                        new Square("b3"),
                                        new Square("c3"),
                                        new Square("e3"),
                                        new Square("f3"),
                                        new Square("g3"),
                                        new Square("h3"),
                                        new Square("d1"),
                                        new Square("d2"),
                                        new Square("d4"),
                                        new Square("d5"),
                                        new Square("d6"),
                                        new Square("d7"),
                                        new Square("d8")
                                    }),
                  "Rook.movesFrom(Square)");
       }

    public static void testPawn() {
        Piece w = new Pawn(Color.WHITE);
        Piece b = new Pawn(Color.BLACK);

        checkB(w.getColor() == Color.WHITE
               && b.getColor() == Color.BLACK , "Pawn.getColor()");

        checkB(w.algebraicName().equals("")
               && b.algebraicName().equals(""),
               "Pawn.algebraicName()");
        checkB(w.fenName().equals("P")
               && b.fenName().equals("p"), "Pawn.fenName()");

        checkB(arraysContainSame(w.movesFrom(new Square("a2")),
                                 new Square[] {
                                     new Square("a3"),
                                     new Square("a4")
                                 })
               && arraysContainSame(b.movesFrom(new Square("a7")),
                                 new Square[] {
                                     new Square("a6"),
                                     new Square("a5")
                                 })
               && arraysContainSame(w.movesFrom(new Square("d3")),
                                 new Square[] {
                                     new Square("d4")
                                 })
               && arraysContainSame(w.movesFrom(new Square("a8")),
                                    new Square[0])
               && arraysContainSame(b.movesFrom(new Square("d6")),
                                 new Square[] {
                                     new Square("d5")
                                 }),
               "Pawn.movesFrom(Square)");
    }

    public static void checkB(boolean result, String testName) {
        if (result) {
            System.out.println("Passed test: " + testName);
        } else {
            System.err.println("Failed test: " + testName);
        }
    }

    public static boolean arraysContainSame(Square[] a1, Square[] a2) {
        Comparator<Square> comp = (s1, s2) -> {
            return s1.toString().compareTo(s2.toString());
        };
        Arrays.sort(a1, comp);
        Arrays.sort(a2, comp);
        boolean output = Arrays.deepEquals(a1, a2);
        if (!output) {
            System.err.println("Arrays not equal: " + Arrays.deepToString(a1)
                               + " " + Arrays.deepToString(a2));
        }
        return output;
    }
}
