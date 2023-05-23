class Program
{
    static void IntStreamTests(int tests_nr, IntStream intStream)
    {
        Console.Write("{0} first elements : ",tests_nr);
        for(int i=1; i<=tests_nr; i++)
        {
            Console.Write("{0}",intStream.next());
            if(i!=tests_nr)
                Console.Write(", ");
             else
                Console.Write("\n");
        }
    }

    static void RandomWordStreamTests(int tests_nr)
    {
        RandomWordStream rws = new RandomWordStream();
        Console.Write("{0} first elements : ",tests_nr);
        for(int i=1; i<=tests_nr; i++)
        {
            Console.Write("{0}",rws.next());
            if(i!=tests_nr)
                Console.Write(", ");
             else
                Console.Write("\n");
        }
    }

    static void reset(IntStream intStream)
    {
        Console.WriteLine("eos? - {0}",intStream.eos());
        Console.WriteLine("reset");
        intStream.reset();
    }

    static void tests_with_reset(IntStream intStream, int test_1, int test_2)
    {
        IntStreamTests(test_1,intStream);
        reset(intStream);
        IntStreamTests(test_2,intStream);
        Console.Write("\n");
    }

    public static void Main() 
    {
        IntStream istr = new IntStream();
        Console.WriteLine("<int_stream>");
        tests_with_reset(istr,10,5);

        IntStream ps = new PrimeStream();
        Console.WriteLine("<prime_stream>");
        tests_with_reset(ps,10,5);

        IntStream rs = new RandomStream();
        Console.WriteLine("<random_stream>");
        tests_with_reset(rs,5,5);

        Console.WriteLine("<random_word_stream>");
        RandomWordStreamTests(6);
    }
}