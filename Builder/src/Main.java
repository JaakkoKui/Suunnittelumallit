
public class Main {

	public static void main(String[] args) {
		
		Director director = new Director();
		IBurgerBuilder hesBurgerBuilder = new HesburgerBurgerBuilder();
		IBurgerBuilder mcBurgerBuilder = new McDonaldsBurgerBuilder();
		
		director.setBuilder(hesBurgerBuilder);
		director.makeHamburger();
		
		HesburgerBurger hesburgerBurger = (HesburgerBurger) hesBurgerBuilder.getBurger();
		hesburgerBurger.getBurger();
		
		
		director.setBuilder(mcBurgerBuilder);
		director.makeHamburger();
		
		McDonaldsBurger mcDonaldsBurger = (McDonaldsBurger) mcBurgerBuilder.getBurger();
		mcDonaldsBurger.getBurger();
		
		
		

	}

}
