public class Consumer extends Thread
{
    Buffer<String> b;

    public Consumer(Buffer<String> b)
    {
        this.b=b;
    }
    
    public void run()
    {
        while(true)
            b.pop();
    }
}
