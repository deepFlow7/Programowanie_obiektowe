public class Doctor extends Type
{
    public Doctor(Object value)
    {
        super(value);
    }

    public int compareTo(Type o)
    {
        if (o instanceof Doctor)
        return 0;
        if ((o instanceof Student) || (o instanceof Master))
            return 1;
        if(o instanceof Professor)
            return -1;
        return -1*o.compareTo(this);
    }
}
