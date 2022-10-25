package observer;

public class DigitalClock implements Observer {

	private ClockTimer timer;

	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
	}

	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		if (s == timer) {
			draw();
		}
	}

	private void draw() {
		// TODO Auto-generated method stub
		int tunti = timer.getTunnit();
		int minuutti = timer.getMinuutit();
		int sekuntti = timer.getSekuntit();

		System.out.println(tunti + "  " + minuutti + " " + sekuntti);
	}

	public void run() {
		timer.run();
	}

}