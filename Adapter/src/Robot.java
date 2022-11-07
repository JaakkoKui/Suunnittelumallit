import java.util.Random;

public class Robot{

	Random random = new Random();
	
	public void throwBomb() {
		
		Random random = new Random();
		
		int damage = random.nextInt(10) + 1;
		
		System.out.println("Robot throws bomb that deals " + damage + " damage.");
	}

	public void drive() {
		
		int move = random.nextInt(5)+1;
		System.out.println("Robot drives forward " + move + " units.");
		
	}

	public void BeepBoop() {
		System.out.println("BeepBoop");
		
	}
	

}
