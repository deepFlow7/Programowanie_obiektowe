public class Leaf extends Expression
{
   
    protected Leaf(Integer v)
    {
       super(v);
    }
   
    protected Leaf(Character v) throws IncorrectVariableExcepction
    {
        super(v);
       if(!Character.isLowerCase(v))
        throw new IncorrectVariableExcepction();
    }

    public String toString()
    {
       return v.toString();
    }
}
