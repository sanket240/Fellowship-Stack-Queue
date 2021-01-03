import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyStack<Integer> myStack=new MyStack<>();
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> myNode=myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode,myNode);
    }
    @Test
    public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode(){
        MyStack<Integer> myStack=new MyStack<>();
        MyNode<Integer> myFirstNode =new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode =new MyNode<>(70);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> myNode=myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode,myNode);

    }

}
