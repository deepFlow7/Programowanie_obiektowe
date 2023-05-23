public class Type implements Comparable<Type>
{   
    public Object value;

    public Type (Object value)
    {
        this.value=value;
    }

    public int compareTo(Type e)
    {
        return -1;
    }

    public String toString()
    {
        return value.toString();
    }
}