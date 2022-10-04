
public class Artichoke extends Toppings{

	public Artichoke(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Artichoke for somereason.");
	}

	@Override
	public String description() {
		return tPizza.description() + ", Artichoke";
	}

	@Override
	public double cost() {
		return tPizza.cost() + 9.99;		
	}
}
