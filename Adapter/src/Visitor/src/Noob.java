

public class Noob implements Visitable{
	
	public void attack() {
		System.out.println("You deal 5 damage");
	}
	
	public void accept(PlayerVisitor visitor, int points) {
		visitor.visit(this, points);
	}
}
