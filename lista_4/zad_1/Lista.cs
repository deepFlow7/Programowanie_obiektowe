using System.Collections;

public class Lista<T> : IEnumerable, ListCollection
{
    Element<T>? first;
    int length=0;

    public int list_size()
    {
        return length;
    }

    public object element(int index)
    {
        return this[index];
    }

    public int Length 
    {
        get { return length; }
        set 
        {
            if(value>length)
                for(int i=length;i<value;i++)
                    push_back(default);
            else 
                if(value>=0)
                    for(int i=length;i>value;i--)
                        pop_back();
        }
    }

    public T this[int index] 
    {
        get 
        {
            if (index<=0 || index>length) 
                throw new Exception("Index out of range");
            Element<T>? pom=first;
            for(int i=1;i<index;i++)
                pom=pom.next;
            return pom.value;
        }
    }

    public override string ToString()
    {
        if(length==0)
            return String.Format("Length of list : {0}", length);
        return String.Format("Length of list : {0}, first element : {1}, last element : {2}", length, this[1],this[length]);
    }

    public IEnumerator GetEnumerator()
    {
        return new ListEnum<T>(first);
    }

    //funkcje z zadania 1 lista 3

    public void push_front(T elem)
    {
        Element<T> new_elem=new Element<T>(elem);
        if(is_empty())
        {
            first=new_elem;
            first.previous=new_elem;
        }
        else
        {
            new_elem.previous=first.previous;
            first.previous=new_elem;
            new_elem.next=first;
            first=new_elem;
        }
        length++;
    }

    public void push_back(T elem)
    {
        if(is_empty())
            push_front(elem);
        else
        {
            Element<T> new_elem=new Element<T>(elem);
            new_elem.previous=first.previous;
            first.previous.next=new_elem;
            first.previous=new_elem;
            length++;
        }
    }

    public T pop_front()
    {
        if(is_empty())
            throw new Exception("Cannot pop, list is empty");
        T value=first.value;
        if(first.next!=null)
                first.next.previous=first.previous;
        first=first.next;
        length--;
        return value;
    } 

    public T pop_back()
    {
        if(is_empty())
            throw new Exception("Cannot pop, list is empty");
        T value=first.previous.value;
        if(first.next==null)
            first=null;
        else
        {   
                first.previous.previous.next=null;
                first.previous=first.previous.previous;
        }
        length--;
        return value;
    }

    public bool is_empty()
    {
        if(first==null)
            return true;
        return false;
    }
}
