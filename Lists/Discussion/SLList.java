package Lists.Discussion;

public class SLList {
    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode first;
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public void insert(int x, int position)
    {
        IntNode currentNode = first;
        int currentPosition = 0;
        while (currentNode != null)
        {
            if (currentPosition + 1 < position)
            {
                currentNode = currentNode.next;
                currentPosition += 1;
            }
            else
            {
                IntNode newNode = new IntNode(x, null);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }
}
