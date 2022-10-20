package common;

import java.util.Scanner;

import decathlon.Deca100M;
import decathlon.Deca1500M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import decathlon.DecaDiscusThrow;
import decathlon.DecaHighJump;
import decathlon.DecaJavelinThrow;
import decathlon.DecaLongJump;
import decathlon.DecaShotPut;
import decathlon.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHighJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class SelectDiscipline {

	int disciplineSelected;
	InputResult inputResult = new InputResult();
	Scanner sc = new Scanner(System.in);
	Deca100M deca100M = new Deca100M();
	Deca400M deca400M = new Deca400M();
	Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
	Deca1500M deca1500M = new Deca1500M();
	DecaLongJump decaLongJump = new DecaLongJump();
	DecaHighJump decaHighJump = new DecaHighJump();
	DecaDiscusThrow discusThrow = new DecaDiscusThrow();
	DecaShotPut decaShotPut = new DecaShotPut();
	DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
	DecaPoleVault poleVault = new DecaPoleVault();

	Hep200M hep200M = new Hep200M();
	Hep800M hep800M = new Hep800M();
	Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
	HeptHighJump hepHighJump = new HeptHighJump();
	HeptLongJump hepLongJump = new HeptLongJump();
	HeptShotPut hepShotPut = new HeptShotPut();
	HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();
	
	//Receive input	of selection of discipline.

	public double inputSelection() {
		System.out.println("Select discipline.");
		printDisciplines();
		double returnTest = 0;

		try {

			disciplineSelected = Integer.parseInt(sc.nextLine());
			returnTest = makeSelection();

		} catch (Exception e) {
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
		}
		return returnTest;

	}

	// Check input of discipline.
	public double makeSelection() {
		double currentScore = 0;
		switch (disciplineSelected) {
		case 1:
			System.out.println("Please enter a value between 5 and 17.8.");
			currentScore = deca100M.calculateResult(inputResult.enterResult());
			break;
		case 2:
			System.out.println("Please enter a value between 20 and 100.");
			currentScore =  deca400M.calculateResult(inputResult.enterResult());
			break;
		case 3:
			System.out.println("Please enter a value between 10 and 28.5.");
			currentScore = deca110MHurdles.calculateResult(inputResult.enterResult());
			break;
		case 4:
			System.out.println("Please enter a value between 2 and 7.");
			currentScore = deca1500M.calculateResult(inputResult.enterResult());
			break;
		case 5:
			System.out.println("Please enter a value between 250 and 1000.");
			currentScore = decaLongJump.calculateResult(inputResult.enterResult());
			break;
		case 6:
			System.out.println("Please enter a value between 0 and 300.");
			currentScore = decaHighJump.calculateResult(inputResult.enterResult());
			break;
		case 7:
			System.out.println("Please enter a value between 2 and 1000.");
			currentScore = poleVault.calculateResult(inputResult.enterResult());
			break;
		case 8:
			System.out.println("Please enter a value between 0 and 85.");
			currentScore = discusThrow.calculateResult(inputResult.enterResult());
			break;
		case 9:
			System.out.println("Please enter a value between 0 and 110.");
			currentScore = decaJavelinThrow.calculateResult(inputResult.enterResult());
			break;
		case 10:
			System.out.println("Please enter a value between 0 and 30.");
			currentScore = decaShotPut.calculateResult(inputResult.enterResult());
			break;
		case 11:
			System.out.println("Please enter a value between 14 and 42.08.");
			currentScore = hep200M.calculateResult(inputResult.enterResult());
			break;
		case 12:
			System.out.println("Please enter a value between 70 and 250.79.");
			currentScore = hep800M.calculateResult(inputResult.enterResult());
			break;
		case 13:
			System.out.println("Please enter a value between 5 and 26.4.");
			currentScore = hep100MHurdles.calculateResult(inputResult.enterResult());
			break;
		case 14:
			System.out.println("Please enter a value between 75.7 and 270.");
			currentScore = hepHighJump.calculateResult(inputResult.enterResult());
			break;
		case 15:
			System.out.println("Please enter a value between 0 and 400.");
			currentScore = hepLongJump.calculateResult(inputResult.enterResult());
			break;
		case 16:
			System.out.println("Please enter a value between 5 and 100.");
			currentScore = hepShotPut.calculateResult(inputResult.enterResult());
			break;
		case 17:
			System.out.println("Please enter a value between 0 and 100.");
			currentScore = hepJavelinThrow.calculateResult(inputResult.enterResult());
			break;
		default:
			System.out.println("Invalid input, try again.");
			System.out.println("");
			inputSelection();
			break;
		}
		return currentScore;
	}

	// Needs more stuff.
	public void printDisciplines() {
		System.out.println("1. Decathlon 100 meters. (Measured in seconds)");
		System.out.println("2. Decathlon 400 meters. (Measured in seconds)");
		System.out.println("3. Decathlon 110 meters hurdles. (Measured in seconds)");
		System.out.println("4. Decathlon 1500 meters. (Measured in minutes and seconds)");
		System.out.println("5. Decathlon Long Jump. (Measured in centimeters)");
		System.out.println("6. Decathlon High Jump. (Measured in centimeters)");
		System.out.println("7. Decathlon Pole Vault. (Measured in centimeters)");
		System.out.println("8. Decathlon Discus Throw. (Measured in meters)");
		System.out.println("9. Decathlon Javelin Throw. (Measured in meters)");
		System.out.println("10. Decathlon Shot Put. (Measured in meters)");
		System.out.println("11. Heptathlon 200 meters.");
		System.out.println("12. Heptathlon 800 meters.");
		System.out.println("13. Heptathlon 100 meters hurdles.");
		System.out.println("14. Heptathlon High Jump.");
		System.out.println("15. Heptathlon Long Jump.");
		System.out.println("16. Heptathlon Shot Put.");
		System.out.println("17. Heptathlon Javelin Throw.");
	}

}