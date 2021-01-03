public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    public MyLinkedList()
    {
        this.head=head;
        this.tail=tail;
    }
    public void add(INode myNode)
    {
        if (this.tail==null)
        {
            this.tail=myNode;
        }
        if (this.head==null)
        {
            this.head=myNode;
        }
        else {
            INode tempNode=this.head;
            this.head=myNode;
            this.head.setNext(tempNode);
        }
    }
    public void printMyNodes()
    {
        StringBuffer myNodes = new StringBuffer("MyNodes");
        INode tempNode=head;
        while (tempNode.getNext()!=null)
        {
            myNodes.append(tempNode.getKey());
            if (!(tempNode.equals(tail))) {
                myNodes.append("->");
            }
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    public void append(INode myNode) {
        if(this.head==null)
        {
            this.head=myNode;
        }
        if (this.tail==null)
        {
            this.tail=myNode;

        }
        else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }
    public INode<K> pop(){
        INode<K> tempNode =this.head;
        this.head= head.getNext();
        return tempNode;
    }
    public INode popLast()
    {
        INode tempNode=head;
        while (!tempNode.getNext().equals(tail))
        {
            tempNode=tempNode.getNext();
        }
        this.tail=tempNode;
        tempNode=tempNode.getNext();
        return tempNode;
    }
    public void insert(INode myNode,INode newNode)
    {
        INode tempNode=myNode.getNext();
        myNode.setNext(tempNode);
        newNode.setNext(tempNode);
    }
    public INode<K> search(K key)
    {
        INode  tempNode =head;
        while (tempNode!=null&&tempNode.getNext()!=null)
        {
            if (tempNode.getKey().equals(key))
            {
                return tempNode;
            }
            tempNode=tempNode.getNext();
        }
        return null;
    }
    public void insertAfter(INode searchNode,INode newNode)
    {
        INode tempNode;
        tempNode=search((K) searchNode);
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }
}
