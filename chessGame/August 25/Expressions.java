public class Expressions {
  public static void main(String[] args) {
    float twoThirds = 2.0f/3;
    // 2.0/3 would be an error since the result would be a double
    // Doing 2.0f/3 would fix it
    double dTwoThirds = 2.0/3; // more decimal places (double float), no rounding
    int threeFourths = (int) (3.0/4.0);
    // int threeFourths = (int) 3.0/4.0; would be error without ()
    System.out.println(twoThirds);
    System.out.println(dTwoThirds);
  }
}


// Double versus float:
// Abstraction: ignoring details, selecting certain things to ignore so you can write software
// Reduce one thing that seems complex so it helps us reason about another thing
// Floating numbers require less space than double
