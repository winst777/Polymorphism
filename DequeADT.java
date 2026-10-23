
public interface DequeADT <T>
{
    void addHead(T element);
    void addTail(T element);
    T removeHead();
    T removeTail();
    String frontview();
    String backview();
}
