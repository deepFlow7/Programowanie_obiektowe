using System;

class Program
{
    static void Main()
    {
        PrimeCollection pc = new PrimeCollection();
        foreach (int p in pc)
            Console.WriteLine(p);        
    }
}
