
public class notSoNoob implements Visitable{
	
	public void attack() {
		System.out.println("You deal 15 damage");
	}
	
	public void accept(PlayerVisitor visitor, int points) {
		visitor.visit(this, points);
	}
}
