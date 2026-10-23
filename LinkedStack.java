import java.util.Stack;
public class LinkedStack <T> implements StackADT<T>
{
    private static final int DEFAULT_CAPACITY=7;
    private int top,size;
    private T[] linkedStack;

    
    public LinkedStack()
    {
        top=0;
        size=0;
        linkedStack=(T[])(new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed on stack
     */
    public void push(T element)
    {
        if(size()==linkedStack.length)
        {
            for(int i=1;i<size;i++)
            {linkedStack[i-1]=linkedStack[i];}
            linkedStack[linkedStack.length-1]=element;
        }
        else
        {
            linkedStack[size]=element;
            size++;
        }
    }

    public T pop() throws EmptyCollectionException
    {
        if (isEmpty())
        {throw new EmptyCollectionException("stack");}
        T result=linkedStack[size-1];
        linkedStack[size-1]=null;
        size--;
        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T peek() throws EmptyCollectionException
    {
        if (isEmpty())
        {throw new EmptyCollectionException("stack");}

        return linkedStack[size-1];
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if stack is empty
     */
    public boolean isEmpty()
    {return linkedStack.length==0;}

    /**
     * Returns the number of elements in this stack.
     * @return number of elements in the stack
     */
    public int size()
    {
        return size;
    }

    /**
     * Returns a string representation of this stack.
     * @return string representation of the stack
     */
    public String toString()
    {
        String result="";
        if (isEmpty())
        {throw new EmptyCollectionException("stack");}
        
        for(int i=0;i<linkedStack.length;i++)
        {result+=linkedStack[i]+"\n";}

        return result;
    }
}