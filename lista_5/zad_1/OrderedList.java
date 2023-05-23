class Element<T> 
{   
    public T value;
    public Element<T> next;

    public Element (T value)
    {
        this.value=value;
    }

    public String toString()
    {
        return value.toString();
    }
}

class EmptyListException extends Exception
{
    EmptyListException()
    {
        super();
    }

    public void info()
    {
        System.out.println("Empty list");
    }
}

public class OrderedList<T extends Comparable<T>> 
{
    private Element<T> head;

    public OrderedList (Element<T> e)
    {
        head=e;
    }

    public void add_element(T elem)
    {
        Element<T> new_elem=new Element<T>(elem);
        if(is_empty() || head.value.compareTo(elem)==1)
        {
            new_elem.next=head;                
            head=new_elem;
        }
        else
        {
            OrderedList<T> temp=new OrderedList<>(head.next);
            temp.add_element(elem);
            head.next=temp.head;
        } 
    }

    public T get_first() throws EmptyListException
    {
        if(is_empty())
            throw new EmptyListException();
        else
            return head.value;  
    }

    public T get_snd() throws EmptyListException
    {
        if(is_empty())
            throw new EmptyListException();
        else
            return head.next.value;  
    }

    public String toString()
    {
        String res="";
        OrderedList<T> temp=this;
        while(!temp.is_empty())
        {
            if(res!="")
                res+=", ";
            try
            {
               res+=(temp.get_first()).toString();
            }
            catch (EmptyListException e) {}
            temp.head=temp.head.next;
        }
        return res;
    }

    public boolean is_empty()
    {
        if(head==null)
            return true;
        return false;
    }
}
