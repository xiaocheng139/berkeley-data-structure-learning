package Lists.ClassTime;

public class DLList {
    public static class IntNode
    {
        private int item;
        private IntNode prev;
        private IntNode next;

        public IntNode(int newItem, IntNode newPrev, IntNode newNext)
        {
            item = newItem;
            prev = newPrev;
            next = newNext;
        }
    }

    private IntNode sentinel;
    private int size;

    public DLList()
    {
        sentinel = new IntNode(0, sentinel, sentinel);
        size = 0;
    }

    public DLList(int item)
    {
        sentinel = new IntNode(0, null, null);
        sentinel.next = new IntNode(item, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    /* Be careful when add or remove elements, need to change the previous element and next element both */
    // Add first
    public void addFirst(int x)
    {
        IntNode previousFirstNode = sentinel.next;
        previousFirstNode.prev = new IntNode(x, sentinel, previousFirstNode);
        sentinel.next = previousFirstNode.prev;
        size += 1;
    }

    // Get first
    public int getFirst()
    {
        return sentinel.next.item;
    }

    // Add last
    public void addLast(int x)
    {
        IntNode previousLastNode = sentinel.prev;
        sentinel.prev = new IntNode(x, previousLastNode, sentinel);
        previousLastNode.next = sentinel.prev;
        size += 1;
    }

    // Get last
    public int getLast()
    {
        return sentinel.prev.item;
    }

    // Remove last
    public void removeLast()
    {
        IntNode previousLastNode = sentinel.prev;
        sentinel.prev = previousLastNode.prev;
        previousLastNode.prev.next = sentinel;
        size -= 1;
    }

    // Get size
    public int size()
    {
        return size;
    }

    public static void main(String[] args) {
        DLList L = new DLList(5);
        L.addFirst(10);
        L.addFirst(15);
        L.addLast(1);
        L.removeLast();
        System.out.println(L.getFirst());
    }
}
