package lists.classTime;

public class IntNode {

    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n)
    {
        item = i;
        next = n;
    }

    public static void main(String[] args) {
        IntNode l = new IntNode (15, null);
        l = new IntNode (10,  l);
        l = new IntNode (5, l);
        System.out.println(l.iterativeGet(2));
    }

    public int size()
    {
        if (this.next == null)
        {
            return 1;
        }
        else
        {
            return this.next.size() + 1;
        }
    }

    public int iterativeSize()
    {
        IntNode p = this;
        int length = 0;
        while (p != null)
        {
            length += 1;
            p = p.next;
        }
        return length;
    }

    public int get(int i)
    {
        if(i == 0)
        {
            return item;
        }
        else
        {
            return next.get(i - 1);
        }
    }

    public int iterativeGet(int i)
    {
        IntNode p = this;
        if (i < 0 | i >= p.size())
        {
            return -1;
        }
        else
        {
            for (int index = 0; index < i; index++)
            {
                p = p.next;
            }
            return p.item;
        }
    }
}
