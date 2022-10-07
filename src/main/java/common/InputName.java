package common;

import java.util.Scanner;

public class InputName {
	String compName = "";

	
	//Add competitor
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);
		
		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			if (!compName.contains(".*[a-öA-ö]")) {
				System.out.println("Only use letters when putting in competitors name.");
				//Changed keyword at line 19 from matches to "contains", preventing a bug causing integers to be accepted as valid names.

			} else {
				active = false;
			}

		} 
		return compName;
	} 
}
