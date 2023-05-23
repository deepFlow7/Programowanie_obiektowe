class PrimeStream : IntStream
{
    public PrimeStream()
    {
        act_number=-1;
    }

    bool is_prime(int n)
    {
        if(n<=1) 
            return false;
        for(int i=2; i<=Math.Sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }

    override public int next()
    {
        if(eos())
        {
            Console.WriteLine("End of PrimeStream");
            return -1;
        }
        if(act_number==-1)
            act_number=2;
        else
            if(act_number==2)
                act_number++;
            else
                {
                    int pom=act_number+2;
                    while(!is_prime(pom))
                        pom+=2;
                    act_number=pom;
                }
        return act_number;
    }

    override public bool eos()
    {
        if(act_number<3)
            return false;
        int pom=act_number;
        while(pom<=int.MaxValue-2)
        {
            pom+=2;
            if(is_prime(pom))
                return false;
        }
        return true;
    }

    override public void reset()
    {
        act_number=-1;
    }
}