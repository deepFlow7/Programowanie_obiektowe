using System;
using System.Collections.Generic;

class Program{

    static void PrintList(int elements_nr, LazyIntList lis)
    {
        Console.Write("{0} first elements : ", elements_nr);
        for(int i=1; i<=elements_nr; i++)
        {
            Console.Write("{0}",lis.element(i));
            if(i!=elements_nr)
                Console.Write(", ");
             else
                Console.Write("\n");
        }
    }

    public static void Main() 
    {
    LazyIntList lazy=new LazyIntList();
    LazyPrimeList prime=new LazyPrimeList();

    Console.WriteLine("<lazy_list>");
    PrintList(7,lazy);
    Console.WriteLine("Size of lazy_list : {0}, size of prime_list : {1}\n",lazy.size(),prime.size());
   
    Console.WriteLine("<prime_list>");
    PrintList(8,prime);
    Console.WriteLine("New size of lazy_list : {0}, new size of prime_list : {1}",lazy.size(),prime.size());
    }
}