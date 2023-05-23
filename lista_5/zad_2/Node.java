public class Node extends Expression
{   
    protected Node(Character v, Expression l, Expression r)
    {
        super(v);
        this.l=l;
        this.r=r;
    }
}
