namespace wektory;

public class Wektor
{
    int n;
    float[] tab;

    public Wektor(int n)
    {
        this.n=n;
        tab=new float[n];
    }
    
    public static Wektor operator+(Wektor v1,Wektor v2)
    {
        if(v1.n!=v2.n)
            throw new Exception("Nie mozna dodac argumentow o roznych wymiarach");
        else
        {
            Wektor w=new Wektor(v1.n);
            for(int i=0;i<w.n;i++)
                w.tab[i]=v1.tab[i]+v2.tab[i];
            return w;
        } 
    }

    public static float operator*(Wektor v1,Wektor v2)
    {
        if(v1.n!=v2.n)
            throw new Exception("Nie mozna dodac argumentow o roznych wymiarach");
        else
        {
            float iloczyn_skalarny=0;
            for(int i=0;i<v1.n;i++)
                iloczyn_skalarny+=v1.tab[i]*v2.tab[i];
            return iloczyn_skalarny;
        } 
    }

    public static Wektor operator*(Wektor v,float skalar)
    {
            Wektor w=new Wektor(v.n);
            for(int i=0;i<w.n;i++)
                w.tab[i]=v.tab[i]*skalar;
            return w; 
    }

    public static Wektor operator*(float skalar,Wektor v)
    {
            return v*skalar; 
    }

    public float norma()
    {
        return (float)Math.Sqrt(this*this);
    }

    public void wypisz_wektor()
    {
        Console.Write("(");
        for(int i=0;i<n;i++)
        {
            Console.Write("{0}",tab[i]);
            if(i!=n-1)
                Console.Write(", ");
            else
                Console.WriteLine(")");
        }              
    }

    public void wspolrzedne(float[] wsp)
    {
        if(wsp.Length<n)
            throw new Exception("Za malo wspolrzednych");
        else
            for(int i=0;i<n;i++)
                tab[i]=wsp[i];
    }
}
