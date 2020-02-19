package SLLists;

import ReferenceRecursionAndList.ClassTime.IntNode;

public class SLList {
    public IntNode first;

    public SLList(int x)
    {
        first = new IntNode(x, null);
    }

    public void addFirst(int x)
    {
        first = new IntNode(x, null);
    }

    public int getFirst()
    {
        return first.item;
    }
}
