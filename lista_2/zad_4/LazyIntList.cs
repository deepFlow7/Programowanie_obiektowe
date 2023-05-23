class LazyIntList
{
    protected int list_size;
    protected List<int> list;

    public LazyIntList()
    {
        list_size=0;
        list=new List<int>();
    }

    public virtual int element(int i)
    {
        if(i>=list_size)
        {
            for(int j=list_size;j<i;j++)
                list.Add(j);
            list_size=i;
        }
        return list[i-1];
    }

    public int size()
    {
        return list_size;
    }
}