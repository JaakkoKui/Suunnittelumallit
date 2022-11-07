
public class HesburgerBurgerBuilder implements IBurgerBuilder {

	private HesburgerBurger burger;

	@Override
	public void newBurger() {
		burger = new HesburgerBurger();
		
	}
	
	@Override
	public void addBun() {
		burger.setPart("Hesburger bun");

	}

	@Override
	public void addPatty() {
		burger.setPart("Hesburger patty");
	}

	@Override
	public void addCheese() {
		burger.setPart("Hesburger cheese");

	}

	@Override
	public void addSalad() {
		burger.setPart("Hesburger salad");

	}

	@Override
	public Object getBurger() {
		return burger;
	}



}
