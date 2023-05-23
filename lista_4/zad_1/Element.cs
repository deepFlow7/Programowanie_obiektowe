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