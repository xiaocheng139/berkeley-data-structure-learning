package Lists.ClassTime;

public class AList  {
    private int[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = new int[0];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    private void resize(int capacity) {
        int[] new_items = new int[capacity];
        System.arraycopy(items, 0, new_items, 0, Math.min(capacity, size));
        items = new_items;
        size = capacity;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        resize(size + 1);
        items[size - 1] = x;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int lastElement = items[size - 1];
        resize(size - 1);
        return lastElement;
    }

    public static void main(String[] args) {
        AList test = new AList();
        test.addLast(1);
        test.addLast(2);
        test.addLast(3);
        System.out.println(test.removeLast());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
    }
}
