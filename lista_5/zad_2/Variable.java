import java.util.Dictionary;

public class Variable extends Leaf
{
    public Variable(Character x) throws IncorrectVariableExcepction
    {
        super(x);
    }

    public int evaluate() throws UnknownVariableValueExcepction
    {
        throw new UnknownVariableValueExcepction();
    }

    public int evaluate(Dictionary<Character,Integer> dict) throws UnknownVariableValueExcepction
    {
        if(dict.get((Character)v)==null)
            throw new UnknownVariableValueExcepction();
        return dict.get((Character)v);
    }
}
