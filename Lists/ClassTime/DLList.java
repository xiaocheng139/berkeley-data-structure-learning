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
        sentinel = new IntNode(0, null, null);
        size = 0;
    }

    public DLList(int item)
    {
        sentinel = new IntNode(0, null, null);
        sentinel.next = new IntNode(item, sentinel, sentinel);
    }

    public static void main(String[] args) {
        DLList L = new DLList(5);
        int x = 123;
    }
}
