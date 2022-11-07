
public class Main {

	public static void main(String[] args) {
		Monster monster = new Monster();
		Robot robot = new Robot();
		RobotAdapter rA = new RobotAdapter(robot);
		
		
		monster.shoot();
		monster.move();
		monster.shout("uukabuuka");
		
		robot.throwBomb();
		robot.drive();
		robot.BeepBoop();
		
		rA.shoot();
		rA.move();
		rA.shout("asd");
	}

}
