// See https://aka.ms/new-console-template for more information

namespace Composite
{
    class Program
    {
        static void Main(string[] args)
        {
            Tietokone tietokone = new Tietokone();
            Muistipiiri muistipiiri = new Muistipiiri(200);
            Kotelo kotelo = new Kotelo(77.7F);
            Prosessori prosessori = new Prosessori(550);
            Naytonohjain naytonohjain = new Naytonohjain(995);
            Emolevy emolevy = new Emolevy(99.9F);
            Verkkokortti verkkokortti = new Verkkokortti(55);


            kotelo.lisaaOsa(emolevy);
            kotelo.lisaaOsa(verkkokortti);
            emolevy.lisaaOsa(naytonohjain);
            emolevy.lisaaOsa(muistipiiri);
            emolevy.lisaaOsa(prosessori);
            
            tietokone.lisaaOsa(kotelo);

            Console.WriteLine("Koko tietokoneen hinta on: " + Math.Round(tietokone.getHinta(), 2) + "e");
        }
    }
}