package abfac;


/**
 * @author Jaakk
 *
 */
public class Main {

    public static void main(String[] args) {
    	TheClothesFactory AF = new AdidasFactory();
    	TheClothesFactory BF = new BossFactory();
    	Jasper jasper = new Jasper();
    	jasper.dress(AF);
    	System.out.println(jasper.toString());
    	jasper.dress(BF);
    	System.out.println(jasper.toString());
    }
}

