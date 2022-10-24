
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		int pelaajia = 5; // kuinka monta pelaajaa halutaan
		int numero = 1;
		int voittaja = 0;
		int voitto = 99;
		
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Pelaaja[] pelaajat = new Pelaaja[pelaajia];
		
		// Luo pelaajat
		for (int i = 0; i < pelaajat.length; i++) {
			pelaajat[i] = new Pelaaja(arvuuttaja, numero);
			++numero;
		}
		
		// Käynnistä säikeet
		for (Pelaaja p : pelaajat) {
			p.run();
		}
		for(Pelaaja pelaaja : pelaajat) {
			
			if(pelaaja.arvauksia < voitto) {
				 voittaja = pelaaja.pelaajaNumero;
				 voitto = pelaaja.arvauksia;
			}
		}
		System.out.println("Voittaja on pelaaja " + voittaja);
		}
	}
