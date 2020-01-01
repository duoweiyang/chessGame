public class ArrayFun {

  private static int[] a1 = {1, 2, 3};  // needs to be static, otherwise error
  private static int[] a2 = {1, 3, 5};

  public static String arrayToString(int[] a) { // add parameters to use it in several places
    //[1,2,3]   <-- want it to look like this
    String result = "[";
    for (int i = 0; i < a.length; i++) {
      result += a[i]; // if you use ln, it prints in gaps, not in succession
      if (i < (a.length - 1)) {
        result += ",";
      }
  }
  return result + "]";
}

  public static int sum(int[] a) {
    int result = 0;
    int i = 0;
    while (i < a.length) {      // <= will result in runtime error: array index out of bounds
      result += a[i];
      i++;
    }
    return result;
  }

    public static void main(String[] args) {
    int[] xs = {1, 2, 3};
    System.out.format("sum(%s) = %d%n", arrayToString(xs), sum(xs));
    int[] vide = new int[0];  // an array of int, size 0
    System.out.format("sum(%s) = %d%n", arrayToString(vide), sum(vide));

    public static void main(String[] args) {
        char[][] grid = {{'a', 'b', 'c'},
                        {'d', 'e', 'f'}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
              System.out.println([i][j]);
        }
      }
    }
  }


    /*
    int x = 1;
    int y = x;
    y = 2;
    System.out.format("x: %d%n", x);
    System.out.format("y: %d%n", y);
    */

    int[] a1 = {1, 2, 3};
    int[] a2 = {1, 2, 3};
    a2[0] = 42;             // if a2 = a1, then a1 would also have {42, 2, 3}
    System.out.format("a1: %s%n", arrayToString(a1));
    System.out.format("a2: %s%n", arrayToString(a2));
    //System.out.println(arrayToString(a1));  // this a is the first a
    //System.out.println(arrayToString(a2)); // logic itself is only used in one place
  }
}

// Copying and pasting code is not code reuse. It's duplication.
// You'll likely create bugs if you duplicate it.
// Try not to reuse names. It's confusing.
// += is a naive way to build up a string. Really intensive code will make some of it = garbage code
