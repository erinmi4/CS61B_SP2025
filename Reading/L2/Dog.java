public class Dog {
  public int weightInPounds;
  public String name;

  public Dog(int w, String name) {
    this.weightInPounds = w;
    this.name = name;
  }

  public void makeNoise() {
    if (weightInPounds < 10) {
      System.out.println("yipyipyip!");
    } else if (weightInPounds < 30) {
      System.out.println("bark. bark.");
    } else {
      System.out.println("woof!");
    }
  }

  //这是一个静态方法
  public static String maxDog(Dog d1, Dog d2) {
    if (d1.weightInPounds > d2.weightInPounds) {
      return d1.name;
    }
    return d2.name;
  }

  //这是一个实例方法
  public String maxDog(Dog d) {
    if (this.weightInPounds > d.weightInPounds) {
      return this.name;
    }
    return d.name;
  }
}