public class Program 
{
    public static void main(String[] args) throws Exception 
    {
        Buffer<String> buf=new Buffer<>(50);
        Consumer c=new Consumer(buf);
        Producer p=new Producer(buf);
        
        c.start();
        p.start();
    }
}
