
public class EmptyPizza implements Pizza {

	@Override
	public String description() {
		return "Only the dough";
	}

	@Override
	public double cost() {
		return 7;
	}
	
}
