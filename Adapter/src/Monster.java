import java.security.AlgorithmParameterGenerator;
import java.util.Random;

public class Monster implements Attacker {

	Random random = new Random();
	
	
	@Override
	public void shoot() {
		int damage = random.nextInt(10) + 1;
		System.out.println("Monster shoots for " + damage + " damage.");

	}

	@Override
	public void move() {
		int move = random.nextInt(5)+1;
		System.out.println("Monster walks " + move + " units.");

	}

	@Override
	public void shout(String shout) {
		System.out.println(shout);

	}

}
