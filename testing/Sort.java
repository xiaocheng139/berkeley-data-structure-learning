package testing;

public class Sort {
    public static void sort(String[] args) {
        // find the smallest item
        // move it to the front
        // selection sort the rest (using recursion?)
        sortHelper(args, 0);

    }

    public static void sortHelper(String[] x, int index)
    {
        if (index == x.length)
        {
            return;
        }
        swap(x, index, findSmallest(x, index));
        sortHelper(x, index + 1);
    }

    /** Swap item a with b */
    public static void swap(String[] x, int a, int b)
    {
        String temp = x[b];
        x[b] = x[a];
        x[a] = temp;
    }

    /** Returns the smallest string in x. */
    public static int findSmallest(String[] x, int start) {
        int smallestIndex = start;
        for (int i = start; i < x.length; i++)
        {
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp < 0)
            {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
