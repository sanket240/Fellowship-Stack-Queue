public class MyStack<K> {
    public final MyLinkedList<K> myLinkedList;
    public MyStack()
    {
        myLinkedList=new MyLinkedList<>();
    }
    public void push(INode<K> element)
    {
        myLinkedList.add(element);
    }
    public INode<K> peak()
    {
        return myLinkedList.head;
    }
    public void printStack()
    {
        myLinkedList.printMyNodes();
    }
    public INode<K> pop()
    {
        return myLinkedList.pop();
    }
}