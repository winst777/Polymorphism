
public class DequeDriver
{
    public static void main(String[]args)
    {
        Deque <Integer> deque=new Deque <> ();
        
        for(int i=0;i<60;i+=10)
        {deque.addHead(i);}
        
        System.out.println("Front view: "+deque.frontview());
        System.out.println("Back view: "+deque.backview());
        
        for(int i=60;i<130;i+=10)
        {deque.addTail(i);}
        
        System.out.println("Front view: "+deque.frontview());
        System.out.println("Back view: "+deque.backview());
        
        System.out.println("Removed from head: " + deque.removeHead());
        System.out.println("Front view after remove head: "+deque.frontview());
        System.out.println("Back view after remove head: "+deque.backview());
        
        System.out.println("Removed from tail: " + deque.removeTail());
        System.out.println("Front view after remove tail: "+deque.frontview());
        System.out.println("Back view after remove tail: "+deque.backview());
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());
        System.out.println("Remaining elements: " + deque.frontview());
    }
}
