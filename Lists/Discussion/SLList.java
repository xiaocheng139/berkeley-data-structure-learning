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

        IntNode preNode = null;
        IntNode currentNode = first;

        while (currentNode != null)
        {
            IntNode temp = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = temp;
        }
        first = preNode;
    }

    public void reverseRecursive()
    {
        if (first == null || first.next == null)
        {
            return;
        }
        first = reverseRecursiveHelper(first);
    }

    public IntNode reverseRecursiveHelper(IntNode first)
    {
        if (first == null || first.next == null)
        {
            return first;
        }
        IntNode restNode = first.next;
        IntNode reversed = reverseRecursiveHelper(first.next);
        restNode.next = first;
        first.next = null;
        return reversed;
    }

    public static void main(String[] args) {
        SLList exa = new SLList();
        exa.addFirst(1);
        exa.addFirst(2);
        exa.addFirst(5);
        exa.insert(10, 3);
        exa.reverseRecursive();
        System.out.println(123);
    }
}
