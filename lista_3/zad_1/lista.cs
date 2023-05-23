namespace lists;

class Element<T> 
{   
    public T value;
    public Element<T>? next;
    public Element<T>? previous;

    public Element (T value)
    {
        this.value=value;
    }
}

public class Lista<T> 
{
    Element<T>? first;

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
        return value;
    }

    public bool is_empty()
    {
        if(first==null)
            return true;
        return false;
    }
}

