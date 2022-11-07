

public class Main {

	public static void main(String[] args) {
		PlayerVisitor player = new PlayerVisitor();
		int points = 10;
		Noob noob = new Noob();
		notSoNoob notSoNoob = new notSoNoob();
		Master master = new Master();
		

		noob.attack();
		noob.accept(player, points);
		notSoNoob.attack();
		notSoNoob.accept(player, points);
		master.attack();
		master.accept(player, points);
	}

}
