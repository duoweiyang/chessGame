public class RecitationTwo {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];
    int[][] arr2 = {{1, 2, 3, 4, 5}, {2, 3, 4, 5}};

    arr = new int[3][6];
    arr = arr2;
    System.out.println(arr2[1].length);
    System.out.println(arr2[0][0]);
    System.out.println(max(4,8,10,5));

  }
  public static int max(int... numbers) {
    int[] other = numbers;
    int max = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(java.util.Arrays.toString(numbers));
      System.out.println(i + ": " +numbers[i]);
      max = max < numbers[i] ? numbers[i] : max;
      System.out.println("max:" + max);

    }
    return max;
  }
}
