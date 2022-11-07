import java.util.ArrayList;

public interface IBurgerBuilder {

	public void newBurger();
	
	public void addBun();

	public void addPatty();

	public void addCheese();

	public void addSalad();
	
	public Object getBurger();
}
