package Reading.L1;

public class HelloNumber {
  public static void main(String[] args) {
    System.out.println("Hello number!");
    int x;
    int sum = 0;
    for (x = 0 ; x < 10 ; x++) {
      sum = sum + x;
      System.out.print(x);
    }
    System.out.println();
    System.out.println(sum);
  }
}
