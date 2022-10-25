import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

class DiceGame extends Game {

	/* Implementation of necessary concrete methods */
	private int plays = 0;
	private int min = 1;
	private int max = 6;
	private int rounds = 3;
	private boolean end = false;
	List<Integer> score;

	void initializeGame() {

		plays = 0;
		score = new ArrayList<>(playersCount);
		score.add(0);
		score.add(0);
		score.add(0);
		
	}

	void makePlay(int player) {
		int dice = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("Player number " + (player+1) + " got number " + dice);
		score.add(player, ((score.get(player) + dice)));
		plays++;
		if (plays == (playersCount*rounds)) {
			end = true;
		}
	}

	boolean endOfGame() {
		return end;
	}

	void printWinner() {
		for (int i = 0; i < playersCount; i++) {
			score.get(i);
		}
		Integer winnerScore = Collections.max(score);
		Integer winnerIndex = score.indexOf(winnerScore);
		System.out.println("Player number " + (winnerIndex+1) + " won with number " + winnerScore + "!");
	}
}
