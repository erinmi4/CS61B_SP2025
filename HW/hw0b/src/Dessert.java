public class Dessert {
  int flavor;
  int price;
  static int numDesserts = 0;//跟踪到目前为止创建的甜品数量

  public Dessert(int f, int p){
  this.flavor = f;
  this.price = p;
  numDesserts++;
}
  //打印甜品的口味和价格，以及甜品总数
  public void printDessert(){
  System.out.printf("%d %d %d\n", this.flavor, this.price, numDesserts);
}
  public static void main(String[] args){
    System.out.println("I love dessert!");
}
}
