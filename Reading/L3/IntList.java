public class IntList {
  public int first; //头节点
  public IntList rest; //后面的一个链表

  public IntList(int f, IntList r){
    //在一个链表的前面添加一个节点
    first = f;
    rest = r;
  }

  //获得当前链表的长度
  public static int iterativeSize(IntList L){
    int size = 0;
    while (L != null){
      size++;
      L = L.rest;
    }
    return size;
  }

/** Return the size of the list using... recursion! */
  public int size() {
    if (rest == null) {
      return 1;
    }
    return 1 + this.rest.size();
  }
//通过索引获得数值
  public int get(int i){
    //错误索引判断
    int size = this.size();
  if (i < 0 || i >= size) {
    throw new IndexOutOfBoundsException("索引无效");
  }
  IntList temp = this;
  while (i > 0){
    i--;
    temp = temp.rest;
  }
  return temp.first;
  }

  public static void main(String[] args) {
    IntList L = new IntList(5, null);
    L.rest = new IntList(10, null);
    L.rest.rest = new IntList(15, null);
    System.out.println(L.first);
    System.out.println(L.rest.first);
    System.out.println(L.size());
    System.out.println(L.get(0));
    System.out.println(L.get(1));
    System.out.println(L.get(2));

}
}

