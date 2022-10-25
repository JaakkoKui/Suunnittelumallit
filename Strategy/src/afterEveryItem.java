import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class afterEveryItem implements ListConverter{

	@Override
	public String listToString(List numbers) {
		StringBuilder afterEvery = new StringBuilder();
		Iterator<Integer> iterator = numbers.listIterator();
		while(iterator.hasNext()) {
			afterEvery.append(iterator.next()+"\n");
		}
		return afterEvery.toString();

	}

}
