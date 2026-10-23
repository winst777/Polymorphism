
public class Node<T> 
{
    private T element;
    private Node <T> next;

    public Node(T element) 
    {
        this.element=element;
        this.next=null;
    }

    public T getElement() 
    {return element;}

    public void setNext(Node <T> next) 
    {this.next=next;}

    public Node<T> getNext() 
    {
        return next;
    }
}