
public class Bun implements IBurgerPart {

	private String bunType;

	public Bun(String type) {
		this.bunType = type;
	}

	@Override
	public String getBurgerPart() {

		return bunType;
	}
}