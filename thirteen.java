public class thirteen {

  // number pyramid

  public static void main(String[] args) {

    int n = 5;
    for (int i = 1; i <= n; i++) {
      // printing spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // printing row no with row no times
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }

}
