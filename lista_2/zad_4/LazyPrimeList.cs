class LazyPrimeList : LazyIntList
{
    int prime(int previous)
    {
        if(previous==2)
            return 3;
        int next=previous+2;
        bool pom=true;
        while(pom)
        {
            for(int i=2;i<=Math.Sqrt(next);i++)
                if(next%i==0)
                {
                    pom=false;
                    break;
                }
            if(pom==false)
            {
                pom=true;
                next+=2;
            }
            else
                return next; 
        }
        return next;
    }

    override public int element(int i)
    {
        if(i>=list_size)
        {
            for(int j=list_size;j<i;j++)
                if(j==0)
                    list.Add(2);
                else
                    list.Add(prime(list[j-1]));
            list_size=i;
        }
        return list[i-1];
    }
}