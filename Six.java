public class Six {

  /*
   * half pyramid with numbers
   * 1
   * 12
   * 123
   * 1234
   * 12345
   */

  public static void main(String[] args) {

    int n = 5;

    // outer loop
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= i; j++) {
        System.err.print(j);
      }
      System.out.println();
    }

  }

}
