public class Eleventh {
  // butterfly Pattern
  public static void main(String[] args) {
    int n = 4;
    // outer loop for upper part
    for (int i = 1; i <= n; i++) {
      // printing * for 1st half
      for (int j = 1; j <= i; j++) {
        System.out.print("*");

      }
      // printing the spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // printing * for 2nd half
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // outer loop for lower half
    for (int i = n; i >= 1; i--) {

      // printing * for 1st half
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      // printing spaces
      for (int j = 2 * (n - i); j >= 1; j--) {
        System.out.print(" ");
      }
      // printing * for 2nd half
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
