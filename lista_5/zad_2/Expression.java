import java.util.Dictionary;

public class Expression 
{
    Object v;
    Expression l;
    Expression r;

    protected Expression(Object v)
    {
        this.v=v;
    } 

    public String toString()
    {
        String res="";
        if(l instanceof Leaf || (l.getClass()==this.getClass()))
            res+=l.toString();
        else
        {    
            res+="(";
            res+=l.toString();
            res+=")";
        }
        res+=v.toString();
        if(r instanceof Leaf || (r.getClass()==this.getClass()))
            res+=r.toString();
        else
        {    
            res+="(";
            res+=r.toString();
            res+=")";
        }
        return res;
    }

    int evaluate() throws UnknownVariableValueExcepction
    {
       return 0;
    }

    int evaluate(Dictionary<Character,Integer> dict) throws UnknownVariableValueExcepction
    {
       return 0;
    }
}
