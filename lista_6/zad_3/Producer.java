import java.util.Random;

class Production extends Thread
{
    String word="";

    public void run()
    {
        Random r=new Random();
        String new_word="";
        int length=r.nextInt(100);
        for(int i=0;i<length;i++)
            new_word+=(char)(97+r.nextInt(26)); 
        this.word=new_word;
    }
}

public class Producer extends Thread
{
    Buffer<String> b;
    Production p;

    public Producer(Buffer<String> b)
    {
        this.b=b;
        p=new Production();
        p.start();

    }

    public void run()
    {
        while(true)
            b.push(p.word);
    }
}
