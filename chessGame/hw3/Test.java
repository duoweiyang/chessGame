/*public class Test {
    public static void main(String[] args) {
      try {
          new Square('b', '9');
      } catch (InvalidSquareException e) {
        System.out.println("Invalid square.");
        System.out.println(e.getMessage());
      } finally {
        System.out.println("Done1");
      }
      try {
          String invalidSquare = "ff";
          new Square(invalidSquare);
          //fail("No InvalidSquareException for invalid square: " + invalidSquare);
      } catch (InvalidSquareException e) {
          System.out.println("Invalid square.");
          System.out.println(e.getMessage());
      } finally {
        System.out.println("Done2");
      }
      //Square s = new Square("f7");
      //assertEquals('f', s.getFile());
      //assertEquals('7', s.getRank());
      //Square s2 = new Square('e', '4');
      //assertEquals("e4", s2.toString());
    }
} */

public class Test {
    public static void main(String args[]) throws InvalidSquareException {
        try {
            new Square("a1");
            System.out.println("good 1");
        } catch (InvalidSquareException e) {
            System.out.println("bad 1: " + e.getMessage());
        }
        try {
            String invalidSquare = "a9";
            new Square(invalidSquare);
            System.out.println("bad 2");
        } catch (InvalidSquareException e) {
            System.out.println("good 2: " + e.getMessage());
        }
        Square s = new Square("f7");
        System.out.println('f' == s.getFile());
        System.out.println('7' == s.getRank());
        Square s2 = new Square('e', '4');
        System.out.println("e4".equals(s2.toString()));
    }
}
