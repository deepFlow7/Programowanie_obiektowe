public class Student extends Type
{
    public Student(Object value)
    {
        super(value);
    }

    @Override
    public int compareTo(Type o)
    {
        if (o instanceof Student) 
            return 0;
        if ((o instanceof Doctor) || (o instanceof Professor) || (o instanceof Master))
            return -1;
        return -1*o.compareTo(this);
    }
}