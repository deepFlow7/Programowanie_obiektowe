import java.util.Dictionary;

public class Const extends Leaf
{
    public Const(Integer x)
    {
        super(x);
    }

    public int evaluate()
    {
        return (Integer)v;
    }

    public int evaluate(Dictionary<Character,Integer> dict)
    {
       return (Integer)v;
    }
}
