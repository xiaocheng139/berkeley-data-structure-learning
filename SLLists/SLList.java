package SLLists;

public class SLList {
    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode sentinel;
    private int size;

    // Create a sentinel node that will link to the first node
    public  SLList()
    {
        sentinel = new IntNode(0, null);
        size = 0;
    }
    
    public SLList(int x)
    {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x)
    {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    // Iterative
    public void addLast(int x)
    {
        IntNode p = sentinel;
        while (p.next != null)
        {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    // Recursive
    public void addLast2(int x)
    {
        IntNode L = addLastHelper(sentinel, x);
        L.next = new IntNode(x, null);
        size += 1;
    }

    // This method is to get the last node of current list
    private IntNode addLastHelper(IntNode L, int x)
    {
        if (L.next == null)
        {
            return L;
        }

        return addLastHelper(L.next, x);
    }

    // Iterative method
    public int size()
    {
        int size = 0;
        IntNode p = sentinel.next;
        while (p != null)
        {
            size ++;
            p = p.next;
        }
        return size;
    }

    // Recursive method
    public int size2()
    {
        return size_helper(sentinel.next);
    }

    private int size_helper(IntNode p)
    {
        if (p == null)
        {
            return 0;
        }
        return 1 + size_helper(p.next);
    }

    public int getFirst()
    {
        return sentinel.next.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast2(3);
        System.out.println(L.size());
        System.out.println(L.getFirst());
    }
}
