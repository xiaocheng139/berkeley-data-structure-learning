package lists.classTime;

import java.util.Objects;

public class AList <Item> implements List61B <Item>{
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

    /** Inserts X into the start of the list. */
    @Override
    public void addFirst(Item x)
    {
        if (size == items.length)
        {
            resize(size + 1);
        }

    }

    /** Inserts X into the back of the list. */
    @Override
    public void addLast(Item x) {
        if (size == items.length)
        {
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the beginning of the list*/
    @Override
    public Item getFirst()
    {
        return items[0];
    }

    /** Returns the item from the back of the list. */
    @Override
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
    @Override
    public Item removeLast() {
        Item lastElement = getLast();
        items[size - 1] = null;
        return lastElement;
    }

    /** Insert item into given position */
    public void insert(Item x, int p)
    {
        Item[] newItems = (Item[]) new Objects[items.length + 1];
        /** Copy items from 0 to position */
        System.arraycopy(items, 0, newItems, 0, p);

        /** Apply the Item value to position p */
        newItems[p] = x;

        /** Copy items from p+1 to the new end position */
        System.arraycopy(items, p, newItems, p + 1, items.length - p);

        items = newItems;
        size += 1;
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
