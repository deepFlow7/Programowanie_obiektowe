public class Professor extends Type
{
    public Professor(Object value)
    {
        super(value);
    }

    @Override
    public int compareTo(Type o)
    {
        if (o instanceof Professor)
            return 0;
        if ((o instanceof Doctor) || (o instanceof Master) || (o instanceof Student))
            return 1;
        return -1*o.compareTo(this);
    }
}