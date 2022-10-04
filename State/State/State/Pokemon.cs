using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.XPath;

namespace StateTeht
{

    public class Pokemon
    {
        public static int xp = 0;
        public static State _state = new Charmander();
        public void attack() {
            _state.Attack();
        }
        public void rest() {
            _state.Rest();    
        }
        public void fly()
        {
            _state.Fly();
        }


        public void SetState(State state)
        {
            _state = state;
        }

        public interface State
        {
            void Evolve(Pokemon pokemon);
            void Attack();
            void Rest();
            void Fly();
        }


        public class Charmander : State
        {
            public void Evolve(Pokemon pokemon)
            {
                pokemon.SetState(new Charmeleon());
            }
            public void Attack() 
            {
                Console.WriteLine("Charmander uses ignite");
                xp++;
                if (xp == 3) {
                    Console.WriteLine("-------------------------------------\nIts evolving!\n-------------------------------------");
                    _state = new Charmeleon();
                }
            }
            public void Rest() {
                Console.WriteLine("Charmander sleeps");
            }
            public void Fly() {
                Console.WriteLine("Charmander doesnt know how to fly.");
            }
        }

        public class Charmeleon : State
        {
            public void Evolve(Pokemon pokemon)
            {
                pokemon.SetState(new Charizard());
            }
            public void Attack()
            {
                Console.WriteLine("Charmeleon uses fireball");
                xp++;
                if (xp == 6)
                {
                    Console.WriteLine("-------------------------------------\nIts evolving!\n-------------------------------------");
                    _state = new Charizard();
                }
            }
            public void Rest()
            {
                Console.WriteLine("Charmeleon sleeps");
            }
            public void Fly()
            {
                Console.WriteLine("Charmeleon still doesnt know how to fly.");
            }
        }

        public class Charizard : State
        {
            public void Evolve(Pokemon pokemon)
            {
                Console.WriteLine("Max evolve");
                xp++;
                if (xp == 9)
                {
                    Console.WriteLine("Charizard cant evolve anymore."); ;
                }
            }
            public void Attack()
            {
                Console.WriteLine("Charizard uses fireblast");
            }
            public void Rest()
            {
                Console.WriteLine("Charizard sleeps");
            }
            public void Fly()
            {
                Console.WriteLine("Charizard takes off!");
            }
        }
    }
}
