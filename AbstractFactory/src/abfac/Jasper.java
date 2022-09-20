package abfac;

import java.io.Console;

public class Jasper {
	
	private Cap cap;
	private Jeans jeans;
	private Shoes shoes;
	private Shirt shirt;

	public void dress(TheClothesFactory factory) {
		cap = factory.makeCap();
		jeans = factory.makeJeans();
		shoes = factory.makeShoes();
		shirt = factory.makeShirt();
	}
	
	public String toString() {
		return "I have " + cap.Brand() + ", " + jeans.Brand() + ", " + shoes.Brand() + " and a " + shirt.Brand();
	}
	
	
	
}
