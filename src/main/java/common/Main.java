package common;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//JFRAME AREA
		MyFrame frame = new MyFrame();
		//JFRAME AREA


		/*Scanner scan = new Scanner(System.in);
		InputName inputName = new InputName();
		SelectDiscipline selectDiscipline = new SelectDiscipline();


		boolean choice = true;
		boolean nameChosen = false;
		String currentName = "";
		double totalScore = 0;

		while (choice) {


			if(!nameChosen){
				currentName = inputName.addCompetitor();
				nameChosen = true;
			}
			totalScore += selectDiscipline.inputSelection();

			System.out.println(currentName + " currently has a total score of: " + totalScore);
			System.out.println("Do you want to add more scores to " + currentName + " Y/N?");
			String input = scan.nextLine();

			if(input.equalsIgnoreCase("Y")) {
				System.out.println("You pressed Y!");
			} else if(input.equalsIgnoreCase("N")) {
				System.out.println("You pressed N!");
				choice = false;
			} else {
				System.out.println("Wtf yo!");
			}

		}*/
	}
}