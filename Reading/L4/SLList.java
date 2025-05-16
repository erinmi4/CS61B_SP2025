public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;


    public SLList(int x) {
        first = new IntNode(x, null);
                size = 1;

    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size = 1;

    }

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

/** Adds an item to the end of the list. */
    public void addLast(int x) {
        IntNode p = first;    /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
            size = 1;
        }
        p.next = new IntNode(x, null);
    }

/** 返回从 IntNode p 开始的链表长度。 */
    private static int size(IntNode p) {
        if (p == null) {
            return 0;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size;
    }
}