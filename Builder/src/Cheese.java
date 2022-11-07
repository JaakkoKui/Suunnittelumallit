
public class Cheese implements IBurgerPart{

	private String cheeseType;

	public Cheese(String type) {
		this.cheeseType = type;
	}

	@Override
	public String getBurgerPart() {

		return cheeseType;
	}
}