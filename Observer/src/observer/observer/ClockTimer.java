package observer;

public class ClockTimer extends Subject {

	private int sekuntit = 59;
	private int minuutit = 59;
	private int tunnit = 23;
	private int hour = 23;
	private int minute = 0;
	private int second = 0;

	private int counter = 0;
	private int limit = 4800;

	public void run() {
		for (counter = 0; counter < limit; counter++) {
			tick();

		}
	}

	public int getTunnit() {
		return hour;
	}

	public int getMinuutit() {
		return minute;
	}

	public int getSekuntit() {
		return second;
	}

	void tick() {

		if (second >= sekuntit) {
			second = 0;
			if (minute >= minuutit) {
				minute = 0;
				if (hour >= tunnit) {
					hour = 0;
				} else {
					hour++;
				}

			} else {

				minute++;
			}
		} else {
			second++;
		}

		notifyObservers();
	}

}