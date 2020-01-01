/*public class Barf {

  public static void main(String[] args) {
    try {
      // Check for some exceptional condition
      Throwable up = new Throwable("Vomit");
      throw up;
    } catch (Throwable e) { //If you put Exception e it will not compile since Throwable is a checked exception.
      System.out.println(e.getMessage());
    }
  }
}


public class Barf {

  public static void main(String[] args) throws Throwable {
    try {
      // Check for some exceptional condition
      Throwable up = new Throwable("Vomit");
      throw up;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
*/

public class Barf {

  static void baz() throws Exception {
    if (true) throw new Exception("Wee!");
    System.out.println("text");
    //throw new Exception("Wee!");
    // If you add .println("text") here it will be an error ."Unreachable statement"
  }

  static void bar() throws Exception {
    baz();
  }

  static void foo() throws Exception {
    bar();
  }

  public static void main(String[] args) {
    try {
      foo();
      System.out.println("text");
    } catch (Exception e) {
      System.out.printf("Exception in thread \"main\" %s: %s",
      e.getClass().getName(),
      e.getMessage());
      e.printStackTrace();
    }
  }
}




// Throwable is a class
// There's a getMessage method
// Throwable is instantiable
// Throwable from java.lang which is why we didn't import it
// Don't write code like this in reality though
