using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime;
using System.Text;
using System.Threading.Tasks;

namespace Composite
{
    internal class Kotelo : Laiteosa
    {
        public float Hinta { get; set; }
        private List<Laiteosa> Osat;

        public Kotelo(float hinta)
        {
            Hinta = hinta;
            Osat = new List<Laiteosa>();
        }


        public float getHinta()
        {
            Console.WriteLine("Kotelon osat: ");
            this.Hinta = Hinta;
            foreach (Laiteosa osa in Osat)
            {
                Console.WriteLine(osa.GetType().Name + " " + osa.getHinta());
                Hinta += osa.Hinta;
            }
            return Hinta;

        }
        public void setHinta(float uusHinta)
        {
            this.Hinta = uusHinta;
        }

        public void lisaaOsa(Laiteosa osa)
        {
            Osat.Add(osa);
        }
    }

}
