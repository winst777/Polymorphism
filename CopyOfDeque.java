import java.util.ArrayList;
public class CopyOfDeque <T> implements DequeADT <T>
{
    private Node <T> head,tail,next;
    
    private int count;
    public CopyOfDeque(T element)
    {
        count=0;
        head=tail=null;
    }
    
    public CopyOfDeque()
    {
        count=0;
        head=tail=null;
    }

    public void addHead(T element)
    {
        Node <T> newNode=new Node<>(element);
        if(isEmpty())
        {head=tail=newNode;}
        else
        {
            newNode.setNext(head);
            head=newNode;
        }
        count++;
    }
    
    public void addTail(T element)
    {
        Node <T> newNode=new Node <> (element);
        if(isEmpty())
        {head=tail=newNode;}
        else
        {
            tail.setNext(newNode);
            tail=newNode;
        }
        count++;
    }
    public T removeHead()
    {
        if(isEmpty())
        {return null;}
        T element;
        if(head==tail)
        {
            element=head.getElement();
            head=tail=null;
        }
        else
        {
            element=head.getElement();
            head=head.getNext();
            if(head==null)
            {tail=null;}
        }
        count--;
        return element;
    }
    
    public T removeTail()
    {
        if(isEmpty())
        {return null;}
        T element;
        if(head==tail)
        {
            element=head.getElement();
            head=tail=null;
        }
        else{
            Node <T> current=head;
            while(current.getNext()!=tail)
            {current=current.getNext();}
            element=tail.getElement();
            tail=current;
            tail.setNext(null);
        }
        return element;
    }

    public String frontview()
    {
        String result="";
        Node <T> current=head;
        while(current!=null){
            result+=current.getElement()+" ";
            current=current.getNext();
        }
        return result;
    }
    public String backview()
    {
        String result="";
        Node <T> current=head;
        ArrayList <T> elements=new ArrayList<>();
        while(current!=null)
        {
            elements.add(current.getElement());
            current=current.getNext();
        }
        
        for(int i=elements.size()-1; i>=0;i--)
        {result+=elements.get(i)+" ";}
        return result;
    }
    
    public int size()
    {return count;}
    
    public boolean isEmpty()
    {
        return count==0;
    }
}
