import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args){

				ArrayList<String> theMenu = new ArrayList<>();
				
		        Pizza hamPizza = (new Ham(new Sauce(new EmptyPizza())));
		        theMenu.add(hamPizza.description() + " " + hamPizza.cost() + "e \n");
		        Pizza nothamPizza = (new Ananas(new Sauce(new EmptyPizza())));
		        theMenu.add(nothamPizza.description() + " " + nothamPizza.cost() + "e \n");
		        Pizza superPizza = (new Ananas(new Ham(new Artichoke(new Sauce(new EmptyPizza())))));
		        theMenu.add(superPizza.description() + " " + superPizza.cost() + "e \n");
		        System.out.println(theMenu);
		    }

}
