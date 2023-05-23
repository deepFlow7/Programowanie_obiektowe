using System.Collections;

class PrimeCollection : IEnumerable
{
    int elem;

    public PrimeCollection()
    {
        elem=-1;
    }

    public IEnumerator GetEnumerator()
    {
        return new PrimeStrEnum(elem);
    }
}

class PrimeStrEnum : IEnumerator
{
    int elem;
    int curr;
    Prime prime = new Prime();

    public PrimeStrEnum(int elem)
    {
        this.elem = elem;
        this.curr=elem;
    }

    public bool MoveNext()
    {
        int temp=prime.next_prime(curr);
        if(temp==-1)
            return false;
        curr=temp;
        return true;
    }

    public object Current 
    {
        get 
        {
            return curr;
        }
    }

    public void Reset() 
    { 
        curr=elem;
    }
}

