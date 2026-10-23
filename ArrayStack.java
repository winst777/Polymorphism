import java.util.Collections;
import java.util.Arrays;
public class ArrayStack <T> implements StackADT<T>
{
    private final static int DEFAULT_CAPACITY=7;
    private int top;
    private T[] arrayStack;
    public ArrayStack()
    {this(DEFAULT_CAPACITY);}
    
    public ArrayStack(int initialCapacity)
    {
        top=0;
        arrayStack=(T[])(new Object[initialCapacity]);
    }

    public void push(T element)
    {
        if(size()==arrayStack.length)
        {expandCapacity();}
        
        arrayStack[top]=element;//assign element to the empty indicator "top";
        top++;//top increment to next empty position
    }
    public T pop() throws EmptyCollectionException
    {
        if(isEmpty())
        {throw new EmptyCollectionException("arrayStack");}
        
        top--;//off by one to get actual top of arrayStack
        T result=arrayStack[top];//assign actual top to result
        arrayStack[top]=null;//empty the actual top, arrayStack.length off by one
        return result;
    }
    public T peek() throws EmptyCollectionException
    {
        if(isEmpty())
        {throw new EmptyCollectionException("arrayStack");}
        return arrayStack[top-1];//return the actual top of arrayStack(off by one, top-1)
    }
    
    private void expandCapacity()
    {
        arrayStack=Arrays.copyOf(arrayStack,arrayStack.length*2);
        System.out.println("arraystack size expanded by 2.");
    }
    
    
    public boolean isEmpty()
    {
        if(arrayStack.length==0) 
        {return true;}
        else
        {return false;}
    }
    public int size()
    {return top;}
    public String toString()
    {
        String result="";
        for(int i=0;i<arrayStack.length;i++)
        {
            result+=arrayStack[i]+" ";
        }
        return result;
    }
}
