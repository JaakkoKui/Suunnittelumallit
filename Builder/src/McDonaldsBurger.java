import java.util.ArrayList;

public class McDonaldsBurger {

	ArrayList<IBurgerPart> burgerList;
	
	public void newBurger() {
		this.burgerList = new ArrayList<>();
	}
	
	public void setBun(Bun bun) {
		this.burgerList = new ArrayList<>();
		this.burgerList.add(bun);
	}
	
	public void setCheese(Cheese cheese) {
		this.burgerList.add(cheese);
	}
	
	public void setSalad(Salad salad) {
		this.burgerList.add(salad);
	}
	
	public void setPatty(Patty patty) {
		this.burgerList.add(patty);
	}
	
	
	public void getBurger() {
		System.out.println("McDonalds burger:");
		for(IBurgerPart part : burgerList) {
			System.out.println(part.getBurgerPart());
		}
	}
	
}
