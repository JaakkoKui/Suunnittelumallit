import java.util.Random;

public class Arvuuttaja {

	private Random rng;
	
	public Arvuuttaja() {
		rng = new Random();
	}
	
	public synchronized Object liityPeliin() {
		return new Memento(rng.nextInt(10));
	}
	
	public boolean vertaa(Object object, int arvottuLuku) {
		Memento memento = (Memento) object;
		
		if (memento.getLuku() == arvottuLuku) {
			return true;
		}
		return false;
	}
}
