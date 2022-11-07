import java.lang.reflect.Constructor;

public class RobotAdapter implements Attacker{
	
	Robot robot;

	public RobotAdapter(Robot newRobot) {
		robot = newRobot;
	}
		

	@Override
	public void shoot() {
		robot.throwBomb();
		
	}

	@Override
	public void move() {
		robot.drive();
		
	}

	@Override
	public void shout(String shout) {
		robot.BeepBoop();
		
	}
}
