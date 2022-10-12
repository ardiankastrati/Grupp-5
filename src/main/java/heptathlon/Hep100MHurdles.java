package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class Hep100MHurdles {

	private int score;
	private double A = 9.23076;
	private double B = 26.7;
	private double C = 1.835;
	boolean active = true;
	CalcTrackAndField calc = new CalcTrackAndField();
	InputResult inputResult = new InputResult();

	// Calculate the score based on time. All running events.
	public double calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				if (runningTime < 5) {
					System.out.println("Value too low. (Must be higher than 5).");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 26.4) {
					System.out.println("Value too high (Must be lower than 26.4).");
					runningTime = inputResult.enterResult(); //This was commented, being commented resulted in a continuous loop.
				} else {

					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is " + score);
		return score;

	}

}
