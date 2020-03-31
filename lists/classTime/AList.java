package lists.classTime;

public class AList <Item> {
    private Item[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity. */
    private void resize(int capacity) {
        Item[] newItems = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, newItems, 0, size);
        items = newItems;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if (size == items.length)
        {
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        Item lastElement = getLast();
        items[size - 1] = null;
        return lastElement;
    }

    public static void main(String[] args) {
        AList test = new AList<Integer>();
        test.addLast(1);
        test.addLast(2);
        test.addLast(3);
        System.out.println(test.removeLast());
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
    }
}
