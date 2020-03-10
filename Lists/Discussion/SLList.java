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
        if (first == null || position == 0)
        {
            addFirst(x);
        }

        IntNode currentNode = first;
        int currentPosition = 0;

        while (currentPosition + 1 < position && currentNode.next != null)
        {
            currentNode = currentNode.next;
            currentPosition += 1;
        }
        IntNode newNode = new IntNode(x, null);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    /* Reverse the elements in this linked list */
    public void reverse()
    {
        if (first == null || first.next == null)
        {
            return;
        }

        IntNode currentNode = first.next;
        first.next = null;

        while (currentNode != null)
        {
            IntNode temp = currentNode.next;
            currentNode.next = first;
            first = currentNode;
            currentNode = temp;
        }
    }

    public static void main(String[] args) {
        SLList exa = new SLList();
        exa.addFirst(1);
        exa.addFirst(2);
        exa.addFirst(5);
        exa.insert(10, 3);
        exa.reverse();
        System.out.println(123);
    }
}
