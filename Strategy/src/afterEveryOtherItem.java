import java.util.List;

import javax.print.attribute.standard.NumberUpSupported;

public class afterEveryOtherItem implements ListConverter{

	@Override
	public String listToString(List list) {
		StringBuilder every2 = new StringBuilder();
		Object[] numbers = list.toArray();
		for(int i= 0; i<numbers.length; i++) {
           every2.append(numbers[i].toString());
            if ((i+1) % 2 == 0) {
                every2.append("\n");
            } else {
                every2.append(" ");
            }
		}
		return every2.toString();
	}

}
