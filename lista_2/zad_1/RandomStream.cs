class RandomStream : IntStream
{
    public override bool eos()
    {
        return false;
    }

    public override int next()
    {
        Random random = new Random();
        act_number=random.Next();
        return act_number;
    }
}