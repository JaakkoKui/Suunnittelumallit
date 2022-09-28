using System;
using System.Runtime.InteropServices;


//Ostoskori luokka on singleton, vaikka tekisi uuden ostoskorin, ostokset pysyvät korissa.
public class Ostoskori
{
    private static Ostoskori instance = null;

    public static  List<string> tavarat = new List<string>();
    
    private Ostoskori(){}

    public static Ostoskori Instance
    {
        get
        {
            if (instance == null)
            {
                instance = new Ostoskori();
            }
            return instance;
        }
    }

    public void lisaaTavara(string s) {
        String tavara = s;
        Console.WriteLine(s);
        tavarat.Add(tavara);
    }

    public void lisaaTavara()
    {
        Console.WriteLine("Anna lisättävä tavara: ");
        String tavara = (Console.ReadLine());
        tavarat.Add(tavara);
    }

    public void poistaTavara()
    {
        Console.WriteLine("Anna poistettava tavara: ");
        String tavara = (Console.ReadLine());
        tavarat.Remove(tavara);
    }

    public void naytaTavarat() {
        Console.WriteLine("Ostoskorissa " + this + " on tavarat: ");
        tavarat.ForEach(Console.WriteLine);
    }
}