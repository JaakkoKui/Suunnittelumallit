using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Composite
{
    internal class Verkkokortti : Laiteosa
    {
        public float Hinta { get; set; }

        public Verkkokortti(float hinta)
        {
            Hinta = hinta;  
        }

        public float getHinta()
        {
            return Hinta;
        }
        public void setHinta(float uusHinta)
        {
            this.Hinta = uusHinta;
        }
        public void lisaaOsa(Laiteosa osa)
        {
            Console.WriteLine("Verkkokorttiin ei voi lisätä osia.");
        }
    }

}

