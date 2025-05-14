public class Linesum {
  public static void main(String[] args) {
    int sum = 0;
    for (String arg : args) {
        try {
            int num = Integer.parseInt(arg);
            sum += num;
        } catch (NumberFormatException e) {
            System.out.println("无效的数字: " + arg);
        }
    }
    System.out.println("命令行参数的和是: " + sum);
  }
}
