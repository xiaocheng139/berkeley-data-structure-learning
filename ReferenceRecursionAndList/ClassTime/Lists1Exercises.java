package ReferenceRecursionAndList.ClassTime;

public class Lists1Exercises {
    /** Returns an IntNode identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntNode incrList(IntNode L, int x) {
        /* Your code here. */
        if (L == null)
        {
            return null;
        }

        IntNode N  = new IntNode(L.item + x, null);

        N.next = incrList(L.next, x);
        return N;
    }

    public static IntNode incrListIterative(IntNode L, int x)
    {
        if (L == null)
        {
            return null;
        }

        IntNode N = new IntNode(L.item + x, null);
        L = L.next;
        IntNode pointer = N;

        while (L != null)
        {
            pointer.next = new IntNode(L.item + x, null);
            L = L.next;
            pointer = pointer.next;
        }
        return N;
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
        while (L != null)
        {
            L.item -= x;
            L = L.next;
        }
        return L;
    }

    public static IntNode dincrListRecursive(IntNode L, int x)
    {
        if (L == null)
        {
            return null;
        }

        L.item -= x;
        dincrListRecursive(L.next, x);

        return L;
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
         IntNode N = incrListIterative(L, 3);
         IntNode M = dincrList(L, 3);

         System.out.println(N.get(1));
         System.out.println(M.get(1));
    }
}
