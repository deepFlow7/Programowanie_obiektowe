using System.Collections;

class ListEnum<T> : IEnumerator
{
    Element<T> lista;
    Element<T>? current;

    public ListEnum(Element<T> lista) 
    {
        this.lista = lista;
    }

    public bool MoveNext() 
    {
        if (this.current == null) 
            this.current = this.lista;
        else 
            this.current = this.current.next;
        return this.current != null;
    }

    public object Current
    {
        get
        {
        return current.value;
        }
    }
    
    public void Reset() 
    {
        this.current = this.lista;
    }
}