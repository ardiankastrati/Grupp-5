package common;

import java.util.Scanner;

public class InputResult {
	double inputResult = 0;

	public double enterResult() {
		Scanner sc = new Scanner(System.in);
		SelectDiscipline test = new SelectDiscipline();
		boolean active = true;
		while (active) {
			try {

				inputResult = Double.parseDouble(sc.nextLine());
				active = false;
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");
				
			}

		}
		return inputResult;
	}

	public double returnResult() {
		return inputResult;
	}
}
