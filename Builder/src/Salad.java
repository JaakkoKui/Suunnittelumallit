import java.security.PublicKey;

public class Salad implements IBurgerPart{

	private String saladType;
	
	public Salad(String type) {
		this.saladType = type;
	}
	@Override
	public String getBurgerPart() {

		return saladType;
	}

}
