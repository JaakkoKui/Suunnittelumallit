import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static final int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int number : numbers) {
			list.add(number);
		} 
		
		ListConverter every1 = new afterEveryItem();
		System.out.println(every1.listToString(list)); 
		ListConverter every2 = new afterEveryOtherItem();
		System.out.println(every2.listToString(list));
		ListConverter every3 = new afterEveryThirdItem();
		System.out.println(every3.listToString(list));
	}

}
