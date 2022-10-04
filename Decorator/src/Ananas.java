
public class Ananas extends Toppings{

	public Ananas(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Ananas, because it belongs in pizza.");
	}

	@Override
	public String description() {
		return tPizza.description() + ", Ananas";
	}

	@Override
	public double cost() {
		return tPizza.cost() + 1;		
	}
}
