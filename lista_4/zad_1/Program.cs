using System;

interface ListCollection
{
    public int list_size();
    public bool is_empty();
    public object element(int index);
}

class Program
{
    static void Main()
    {
        Lista<int>? l=new Lista<int>();

        l.push_back(4);
        l.push_front(3);
        l.push_back(2);
        l.push_front(7);

        l.Length=7;

        Console.WriteLine("4th element of l : {0}, 7th : {1}",l[4],l[7]);
        Console.WriteLine(l);

        Console.WriteLine("Elements of list l :");
        foreach(int x in l)
            Console.WriteLine(x);

        LazyIntList lazy=new LazyIntList();
        lazy.element(10);

        Console.WriteLine("\nSize of l : {0}, size of lazy : {1}",l.list_size(),lazy.list_size());
        Console.WriteLine("Is l empty? : {0}, Is lazy empty : {1}",l.is_empty(),lazy.is_empty());
        Console.WriteLine("Second element of l : {0}, second element of lazy : {1}",l.element(2),lazy.element(2));
    }
}
