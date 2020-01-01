public class StringFun {
  public static void main(String[] args) {
      String s1 = "foo";
      String s2 = "foo";
      //String s3 = new String("foo")
      System.out.println("s1: " + s1);
      System.out.println("s2: " + s2);
      //System.out.println("s3: " + s3);   in strings.java go try it out
      System.out.println("s1 == s2: " + s1 == s2); // + takes precedence over ==
  }                                                // (string + s1)== s2 is false
}                                                  // So add parenthesis

// In between two of the curly braces --> method
// Between the first of the curly braces --> body
// void: method does not return a value. Called only for hheir effects.
// main: name of the method. Has to be one method that is static, void, and
//public to be main
