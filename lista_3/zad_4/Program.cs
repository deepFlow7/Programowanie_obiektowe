﻿using System;
using wektory;

class Program
{
    static void Main()
    {
        Wektor v1=new Wektor(5),v2=new Wektor(5);
        float[] pom={8.5f,9,0.3f,0,3};
        v1.wspolrzedne(pom);
        pom=new float[]{8,7.25f,5,4.2f,3};
        v2.wspolrzedne(pom);

        Console.Write("v1 = ");
        v1.wypisz_wektor();
        Console.Write("v2 = ");
        v2.wypisz_wektor();
        Console.Write("\n");

        Console.WriteLine("Dlugosc wektora v1: {0}",v1.norma());
        Console.WriteLine("Dlugosc wektora v2: {0}",v2.norma());
        Console.Write("\n");

        Console.WriteLine("Dodawanie wektorow");
        Console.Write("v1 + v2 = ");
        (v1+v2).wypisz_wektor();
        Console.Write("\n");

        Console.WriteLine("Iloczyn skalarny wektorow");
        Console.WriteLine("v1 * v2 = {0}",v1*v2);
        Console.Write("\n");

        int skalar=5;
        Console.WriteLine("Mnozenie wektora przez skalar");
        Console.Write("v1 * {0} = ",skalar);
        (v1*skalar).wypisz_wektor();
    }
}