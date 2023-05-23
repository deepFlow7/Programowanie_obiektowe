public class Master extends Type
{
    public Master(Object value)
    {
        super(value);
    }

    @Override
    public int compareTo(Type o)
    {
        if (o instanceof Master) 
            return 0;
        if ((o instanceof Doctor) || (o instanceof Professor))
            return -1;
        if (o instanceof Student) 
            return 1;
        return -1*o.compareTo(this);
    }
}