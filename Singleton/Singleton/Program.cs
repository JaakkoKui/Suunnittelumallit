using System;
using System.Diagnostics;
using System.Runtime.CompilerServices;

namespace Singletonteht
{
    public class Program
    {

        static void Main(string[] args)
        {
            Ostoskori kori1 = Ostoskori.Instance;
            
            kori1.lisaaTavara("Mehu");
            kori1.lisaaTavara("Kalja");
            kori1.lisaaTavara();
            kori1.naytaTavarat();
            Ostoskori kori2 = Ostoskori.Instance;
            kori2.lisaaTavara();
            kori2.naytaTavarat();
            kori1.poistaTavara();
            kori1.naytaTavarat();

            if (kori1 == kori2)
            {
                Console.WriteLine("Ostoskoreja on vain yksi");
            }
            else
            {
                Console.WriteLine("Ostoskoreja on 2 ?");

            }
        }
    }
}