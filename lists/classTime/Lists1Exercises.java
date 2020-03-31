package lists.classTime;

public class Lists1Exercises {
    /** Returns an IntNode identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntNode incrList(IntNode L, int x) {
        /* Your code here. */
        if(L == null)
        {
            return null;
        }
        IntNode N = new IntNode(L.item + x, null);
        incrList(L.next, x);
        return N;
    }

    public static IntNode increList2(IntNode L, int x)
    {
        IntNode pointer = new IntNode(0, null);
        IntNode res = pointer;

        while (L != null)
        {
            pointer.next = new IntNode(L.item + x, null);
            pointer = pointer.next;
            L = L.next;
        }
        return res.next;
    }

    /** Returns an IntNode identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntNode dincrList(IntNode L, int x) {
        /* Your code here. */
        if (L == null)
        {
            return null;
        }

        IntNode N = L;

        while (L != null)
        {
            L.item -= x;
            L = L.next;
        }

        return N;
    }

    // Recursive
    public static IntNode decreList2(IntNode L, int x)
    {
        if (L == null)
        {
            return null;
        }

        L.item -= x;
        decreList2(L.next, x);
        return L;
    }

    // Recursive
    public static IntNode squareDestructive(IntNode L)
    {
        if (L == null)
        {
            return null;
        }
        L.item = L.item * L.item;
        square(L.next);
        return L;
    }

    // Iterative
    public static IntNode squareDestructive2(IntNode L)
    {
        IntNode sentinel = new IntNode(0, L);

        while (L != null)
        {
            L.item = L.item * L.item;
            L = L.next;
        }
        return sentinel.next;
    }

    // Recursive
    public static IntNode square(IntNode L)
    {
        if (L == null)
        {
            return null;
        }
        return new IntNode(L.item * L.item, squareDestructive(L.next));
    }

    // Iterative
    public static IntNode square2(IntNode L)
    {
        IntNode sentinel = new IntNode(0, null);
        IntNode N = sentinel;
        while (L != null)
        {
            N.next = new IntNode(L.item * L.item, null);
            N = N.next;
            L = L.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        IntNode L = new IntNode(5, null);
        L.next = new IntNode(7, null);
        L.next.next = new IntNode(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntNode.java and
        // run it in the visualizer.
        System.out.println(L.get(1));
        IntNode N = square(L);
        IntNode M = square2(L);
        IntNode O = squareDestructive(L);
        IntNode P = squareDestructive2(L);

        System.out.println(O.get(1));
        System.out.println(P.get(1));
    }
}
