
public class Director {

	private IBurgerBuilder builder;

	public void setBuilder(IBurgerBuilder builder) {
		this.builder = builder;
	}

	public void makeHamburger() {
		this.builder.newBurger();
		this.builder.addBun();
		this.builder.addCheese();
		this.builder.addSalad();
		this.builder.addPatty();
	}
}
