import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Game dices = new DiceGame();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many players? ");  
		int a = sc.nextInt();
		dices.playOneGame(a);

	}

}
