
/**
 * Write a description of class ArrayStackDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class StackDriver
{
    
    public static void main(String[]args)
    {
        ArrayStack <Integer> arrayStack=new ArrayStack<>();
        LinkedStack <String> linkedStack=new LinkedStack <>();
        
        for(int i=1;i<8;i++)
        {arrayStack.push(i);}
        System.out.println("Arraystack pushed:"+arrayStack.toString());
        System.out.println("peeked last element:"+arrayStack.peek());
        System.out.println("Arraystack peeked:"+arrayStack.toString());
        arrayStack.pop();
        System.out.println("Arraystack popped:"+arrayStack.toString());
        for(int i=7;i<14;i++)
        {arrayStack.push(i);}
        System.out.println("Arraystack pushed:"+arrayStack.toString());
        System.out.println("Arraystack size:"+arrayStack.size());
        
        linkedStack.push("John Wick");
        linkedStack.push("Ayase Momo");
        linkedStack.push("Monica Everett");
        linkedStack.push("Agatha Christie");
        linkedStack.push("Kevin Kelly");
        
        System.out.println("linkedstack pushed:");
        System.out.println(linkedStack);
        
        linkedStack.push("Sherlock Holmes");
        linkedStack.push("Miyamizu Mitsuha");
        linkedStack.push("Antonio Lucio Vivaldi");
        System.out.println("linkedstack pushed:");
        System.out.println(linkedStack);
        
        System.out.println("Element peeked: "+linkedStack.peek());
        System.out.println("linkedstack peeked:");
        System.out.println(linkedStack);
        
        System.out.println("Element poped: "+linkedStack.pop());
        System.out.println("linkedstack popped:");
        System.out.println(linkedStack);
        
        
    }

    

}
