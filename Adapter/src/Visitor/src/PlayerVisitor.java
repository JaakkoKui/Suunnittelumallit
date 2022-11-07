

public class PlayerVisitor {

	public void visit(Noob noob, int points) {
		System.out.println("As noob you get "+ (points*1) +  " points");
	}
	
	public void visit(notSoNoob notSoNoob, int points) {
		System.out.println("As not so noob you get " + (points*2) + "points");
		
	}
	
	public void visit(Master master, int points) {
		System.out.println("As master you get " + (points*5) + " points");
		
	}
}
