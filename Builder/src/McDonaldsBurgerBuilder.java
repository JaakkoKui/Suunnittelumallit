import java.util.ArrayList;

public class McDonaldsBurgerBuilder implements IBurgerBuilder {

	private McDonaldsBurger mcBurger;

	@Override
	public void newBurger() {
		this.mcBurger = new McDonaldsBurger();
	}

	@Override
	public void addBun() {
		this.mcBurger.setBun(new Bun("McDonalds bun"));
	}

	@Override
	public void addPatty() {
		this.mcBurger.setPatty(new Patty("McDonalds patty"));
	}

	@Override
	public void addCheese() {
		this.mcBurger.setCheese(new Cheese("McDonalds cheese"));
	}

	@Override
	public void addSalad() {
		this.mcBurger.setSalad(new Salad("McDonalds salad"));
	}

	@Override
	public Object getBurger() {
		return mcBurger;
	}

}
