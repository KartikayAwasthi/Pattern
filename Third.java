public class Third {

  /*
   * Half Pyramid Problem
   *
   * *
   * * *
   * * * *
   * * * * *
   */
  public static void main(String[] args) {

    int row = 5;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.err.println();
    }

  }
}
