import java.util.Dictionary;
import java.util.Hashtable;

public class Program 
{
    public static void main(String[] args) throws IncorrectVariableExcepction, UnknownVariableValueExcepction
    {
        
        Dictionary<Character, Integer> dict = new Hashtable<Character, Integer>();
        dict.put('x', 2);
        dict.put('y', 50);
        dict.put('z', 7);

        Expression expr = new Sub (new Add(new Variable('x'), new Variable('y')),new Add(new Variable('z'), new Const(12)));
        System.out.println("Expression 1 :");
        System.out.print(expr.toString()+" = ");
        System.out.println(expr.evaluate(dict));

        Expression expr2 = new Add (new Add(new Const(67), new Const(90)),new Const(12));
        System.out.println("\nExpression 2 :");
        System.out.print(expr2.toString()+" = ");
        System.out.println(expr2.evaluate(dict));
        
    }
}
