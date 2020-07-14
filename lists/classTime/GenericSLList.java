package lists.classTime;

public class GenericSLList<Whatever>{
    private class StuffNode{

        public Whatever item;
        public StuffNode next;

        public StuffNode(Whatever i, StuffNode n) {
            item = i;
            next = n;
        }
    }
    private StuffNode sentinel;
    private int size;

    // Create a sentinel node that will link to the first node
    public GenericSLList()
    {
        sentinel = new StuffNode(null, null); // TODO the code here is wrong, will update later
        size = 0;
    }

    public GenericSLList(Whatever x)
    {
        sentinel = new StuffNode(null, null); // TODO the code here is wrong, will update later
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    public void addFirst(Whatever x)
    {
        sentinel.next = new StuffNode(x, sentinel.next);
        size += 1;
    }

    // Iterative
    public void addLast(Whatever x)
    {
        StuffNode p = sentinel;
        while (p.next != null)
        {
            p = p.next;
        }
        p.next = new StuffNode(x, null);
        size += 1;
    }

    // Recursive
    public void addLast2(Whatever x)
    {
        StuffNode L = addLastHelper(sentinel, x);
        L.next = new StuffNode(x, null);
        size += 1;
    }

    // This method is to get the last node of current list
    private StuffNode addLastHelper(StuffNode L, Whatever x)
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
        StuffNode p = sentinel.next;
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

    private int size_helper(StuffNode p)
    {
        if (p == null)
        {
            return 0;
        }
        return 1 + size_helper(p.next);
    }

    public Whatever get(int position)
    {
        int index = 0;
        StuffNode p = sentinel.next;
        while (index < position)
        {
            p = p.next;
            index++;
        }
        return p.item;
    }

    public Whatever getFirst()
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
