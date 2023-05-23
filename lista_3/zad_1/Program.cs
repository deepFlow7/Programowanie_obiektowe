using System;
using lists;

class Program
{
    static void Main()
    {
        Lista<int>? l=new Lista<int>();

        Console.WriteLine("Empty list? {0}",l.is_empty());
        Console.WriteLine("Adding elements");

        l.push_back(4);
        l.push_front(3);
        l.push_back(2);
        l.push_front(7);
       
        Console.WriteLine("Removing elements :");

        Console.WriteLine("First element : {0}",l.pop_front());
        Console.WriteLine("Last element : {0}",l.pop_back());
        Console.WriteLine("First element : {0}",l.pop_front());
        Console.WriteLine("Last element : {0}",l.pop_back());

        Console.WriteLine("Empty list? {0}",l.is_empty());
    }
}