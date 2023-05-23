class IntStream
{
    protected int act_number;

    public IntStream()
    {
        act_number=-1;
    }

    public virtual int next()
    {
        if(eos())
        {
             Console.WriteLine("End of IntStream");
             return -1;
        }
       act_number=act_number+1;
       return act_number;
    }

    public virtual bool eos()
    {
        if(act_number<int.MaxValue)
            return false;
        return true;
    }
    
    public virtual void reset()
    {
        act_number=-1;
    }
}