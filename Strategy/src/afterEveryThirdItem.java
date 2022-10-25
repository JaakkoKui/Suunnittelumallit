import java.util.List;

public class afterEveryThirdItem implements ListConverter {

	@Override
	public String listToString(List list) {
		StringBuilder every3 = new StringBuilder();
		String number;
		for (int i = 0; i < list.size(); i++) {

			if (!((i+1) % 3 == 0)) {
				number = (list.get(i).toString() + " ");
			} else {
				number = (list.get(i).toString() + "\n");
			}
			every3.append(number);
		}
		return every3.toString();
	}

}
