class Prime
{
    bool is_prime(int n)
    {
        if(n==0) 
            return false;
        for(int i=2; i<=Math.Sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }

    public int next_prime(int curr)
    {
        if(curr==-1)
            return 2;
        if(curr==2)
            return 3;
        int pom=curr;
        while(pom<=int.MaxValue-2)
        {
            pom+=2;
            if(is_prime(pom))
                return pom;
        }
        return -1;
    }
}
