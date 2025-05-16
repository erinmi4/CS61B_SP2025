public class Walrus {
  int weight;
  double length;
  Walrus(int w, double l) {
    weight = w;
    length = l;
  }
  public String toString() {
    return "weight: " + weight + ", length: " + length;
  }
  public static void main(String[] args) {
    Walrus w = new Walrus(1000, 8.3);
    System.out.println(w);
  }
}
