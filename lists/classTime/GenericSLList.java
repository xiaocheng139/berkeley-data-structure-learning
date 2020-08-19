package lists.classTime;

public class GenericSLList<Whatever> implements List61B<Whatever>{
    private class Node {

        public Whatever item;
        public Node next;

        public Node(Whatever i, Node n) {
            item = i;
            next = n;
        }
    }
    private Node sentinel;
    private int size;

    // Create a sentinel node that will link to the first node
    public GenericSLList()
    {
        sentinel = new Node(null, null);
        size = 0;
    }

    public GenericSLList(Whatever x)
    {
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);
        size = 1;
    }

    @Override
    public void addFirst(Whatever x)
    {
        sentinel.next = new Node(x, sentinel.next);
        size += 1;
    }

    // Iterative
    @Override
    public void addLast(Whatever x)
    {
        Node p = sentinel;
        while (p.next != null)
        {
            p = p.next;
        }
        p.next = new Node(x, null);
        size += 1;
    }

    // Recursive
    public void addLast2(Whatever x)
    {
        Node L = addLastHelper(sentinel, x);
        L.next = new Node(x, null);
        size += 1;
    }

    // This method is to get the last node of current list
    private Node addLastHelper(Node L, Whatever x)
    {
        if (L.next == null)
        {
            return L;
        }

        return addLastHelper(L.next, x);
    }

    // Iterative method
    @Override
    public int size()
    {
        int size = 0;
        Node p = sentinel.next;
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

    private int size_helper(Node p)
    {
        if (p == null)
        {
            return 0;
        }
        return 1 + size_helper(p.next);
    }

    @Override
    public Whatever get(int position)
    {
        int index = 0;
        Node p = sentinel.next;
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

    public Whatever getLast()
    {
        Node p = sentinel;
        while (p.next != null)
        {
            p = p.next;
        }

        return p.item;
    }

    @Override
    public Whatever removeLast()
    {
        Node p = sentinel;
        while (p.next.next != null)
        {
            p = p.next;
        }

        Node lastNode = p.next;
        p.next = null;
        return lastNode.item;
    }

    @Override
    public void insert(Whatever item, int position)
    {
        Node lastBeforePosition = sentinel;
        for (int idx = 0; idx < position; idx++)
        {
            lastBeforePosition = lastBeforePosition.next;
        }
        Node firstAfterPosition = lastBeforePosition.next;
        lastBeforePosition.next = new Node(item, firstAfterPosition);
    }

    @Override
    public void print()
    {
        System.out.println("The boss doesn't know what he is doing");
        for (Node p = sentinel.next; p != null; p = p.next)
        {
            System.out.print(p.item + " ");
        }
    }

    public static void main(String[] args) {
        GenericSLList<Integer> L = new GenericSLList<>();
        L.addFirst(10);
        L.addFirst(5);
        L.addLast2(1);
        L.insert(3, 0);
        System.out.println(L.size());
        System.out.println(L.getFirst());
    }
}
