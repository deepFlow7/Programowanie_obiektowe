class LazyIntList : ListCollection
{
    int size;
    List<int> list;

    public LazyIntList()
    {
        size=0;
        list=new List<int>();
    }

    public object element(int i)
    {
        if(i>=size)
        {
            for(int j=size;j<i;j++)
                list.Add(j);
            size=i;
        }
        return list[i-1];
    }

    public int list_size()
    {
        return size;
    }

    public bool is_empty()
    {
        return size==0;
    }
}