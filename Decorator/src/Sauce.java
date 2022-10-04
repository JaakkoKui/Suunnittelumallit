
public class Sauce extends Toppings{
	
	public Sauce (Pizza pizza) {
		super(pizza);
		System.out.println("Adding sauce");
	}

	@Override
	public String description() {
		return tPizza.description() + ", Sauce";
	}

	@Override
	public double cost() {
		return tPizza.cost() + .90;
	}
}
