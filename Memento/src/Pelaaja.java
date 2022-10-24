import java.util.Random;

public class Pelaaja implements Runnable {


	public int pelaajaNumero;
	private Object obj;
	private Random rng;
	private Arvuuttaja arvuuttaja;
	public int arvauksia, arvaus;

	public Pelaaja(Arvuuttaja a, int pelaajaNumero) {
		this.pelaajaNumero = pelaajaNumero;
		this.rng = new Random();
		this.arvuuttaja = new Arvuuttaja();
		this.arvauksia = 0;
	}

	public void liityPeliin() {
		obj = arvuuttaja.liityPeliin();
	}

	public synchronized boolean arvaa() {
		arvaus = rng.nextInt(10);
		arvauksia++;
		return arvuuttaja.vertaa(obj, arvaus);
	}

	@Override
	public void run() {
		liityPeliin();
		boolean oikeaVastaus = false;
		while (!oikeaVastaus) {
			boolean tulos = arvaa();
			if (tulos) {
				System.out.println("Pelaaja " + pelaajaNumero + " arvasi oikein luvun " + arvaus + " arvauksella " + arvauksia + ".");
				oikeaVastaus = true;
			}else {
				System.err.println(pelaajaNumero + " arvasi väärin luvulla " + arvaus);
			}
		}
	}
}
