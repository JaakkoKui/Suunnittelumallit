
using System;
namespace StateTeht;

class Program
{

    static public void Main(String[] args)
    {
        Pokemon pok = new Pokemon();
        for (int i = 0; i < 9; i++){
            pok.attack();
            Thread.Sleep(150);
            pok.rest();
            Thread.Sleep(150);
            pok.fly();
            Thread.Sleep(150);
        }
    }
}