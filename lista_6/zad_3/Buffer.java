import java.util.ArrayList;
import java.util.List;

public class Buffer<T> 
{
    List<T> buffer;
    int size;

    public Buffer(int size)
    {
        this.size=size;
        buffer=new ArrayList<T>();
    }

    public synchronized void push(T value)
    {
        while(buffer.size()>=size)
            try 
            {
                wait();
            } catch (InterruptedException e){};
        buffer.add(value);
        if(buffer.size()==size)
            System.out.println("Buffer is full");
        notify();
    }

    public synchronized T pop()
    {
        while(buffer.size()==0)
            try 
            {
                wait();
            } catch (InterruptedException e){};
        T res=buffer.remove(0);
        if(buffer.size()==0)
            System.out.println("Buffer is empty");
        notify();
        return res;
    }
}
