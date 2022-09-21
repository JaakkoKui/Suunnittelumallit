// See https://aka.ms/new-console-template for more information

namespace Composite
{
    internal class Tietokone
    {
        public float Hinta;
        private List<Laiteosa> Osat;

        public Tietokone()
        {
         this.Osat = new List<Laiteosa>();
        }

        public void lisaaOsa(Laiteosa osa)
        {
            Osat.Add(osa);
        }

        public float getHinta()
        {
            foreach (Laiteosa osa in Osat)
            {
                Console.WriteLine(osa.GetType().Name + " " + osa.getHinta());
                Hinta += osa.Hinta;
            }
            return Hinta;

        }
    }
}