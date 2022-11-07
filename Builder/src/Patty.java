
public class Patty implements IBurgerPart{

	private String pattyType;

	public Patty(String type) {
		this.pattyType = type;
	}

	@Override
	public String getBurgerPart() {

		return pattyType;
	}
}