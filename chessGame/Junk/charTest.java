public class charTest {
  public static void main(String[] args) {
    char file = 'a';
    int result = (int)file + 1;
    char letter = (char)result;
    System.out.println(Character.getNumericValue(file));
    System.out.println(result);
    System.out.println(letter);
  }
}
