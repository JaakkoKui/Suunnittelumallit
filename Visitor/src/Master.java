
public class Master implements Visitable{

	public void attack() {
		System.out.println("You deal 50 damage");
	}
	
	public void accept(PlayerVisitor visitor, int points) {
		visitor.visit(this, points);
	}
}
