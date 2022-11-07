
public class HesburgerBurger {
	StringBuilder sBuilder;
	
	public HesburgerBurger() {
		sBuilder = new StringBuilder(); 
	}
	
    public void setPart(String part) {
        this.sBuilder.append(part + "\n");

    }
	
	public void getBurger() {
		System.out.println("Hesburger burger: ");
		System.out.println(sBuilder.toString());
	}
}
