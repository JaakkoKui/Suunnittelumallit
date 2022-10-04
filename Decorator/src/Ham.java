
public class Ham extends Toppings{
	
	public Ham(Pizza pizza) {
		super(pizza);
		System.out.println("Adding ham");
	}

	@Override
	public String description() {
		return tPizza.description() + ", Ham";
	}

	@Override
	public double cost() {
		return tPizza.cost() + 1.50;		
	}
}
