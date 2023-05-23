import java.util.Dictionary;

public class Sub extends Node
{
    public Sub(Expression l,Expression r)
   {
       super('-',l,r);
   } 

   public int evaluate() throws UnknownVariableValueExcepction
   {
       return l.evaluate()-r.evaluate();
   }

   public int evaluate(Dictionary<Character,Integer> dict) throws UnknownVariableValueExcepction
    {
        return l.evaluate(dict)-r.evaluate(dict);
    }
}
