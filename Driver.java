import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int answer;
		boolean done = false;
		String doneCheck;
		welcome();
		
		while(!done) {
			
			options();
			answer = keyboard.nextInt();
			
			while(answer < 1 || answer > 4) {
				System.out.print("Error: there is no such option. Try again: ");
				answer = keyboard.nextInt();
			}
			
			if(answer == 1) {
				
				option1();
				int a = keyboard.nextInt();
				switch(a) {
					case 1:
						break;
						
					case 2:
						System.out.println("\nPrint Computer Science core...");
						Course [] CScore = CompSci.getCompSciCore();
						for (int i = 0; i < CScore.length; i++) {
							System.out.println(CScore[i]);
						}
						break;
					case 3:
						System.out.println("Print Complementary core...");
						Course [] CompleCore = CompSci.getComplementaryCore();
						for(int i = 0; i < CompleCore.length; i++) {
							System.out.println(CompleCore[i]);
						}
						break;
					case 4: // CompSci electives
						break;
					case 5: // Math electives
						break;
				}
				
				System.out.print("Do you wish to start over? (Y / N): ");
				doneCheck = keyboard.next();
				if(doneCheck.equalsIgnoreCase("N"))
					done = true;
				else {
					System.out.println("\nGoing back to the beginning...\n");
				}
			}// end of first if
			
			else if (answer == 2) {
				
				System.out.print("Type the course code you wish to check (ex. COMPXXX): ");
				String codeName = keyboard.next();
				Course [] check = CompSci.getCourseList();
				int count = 0;
				for(int i = 0; i < check.length; i++) {
					if(codeName.equals(check[i].getCodeC())) {
						System.out.println(check[i].infoPre(check[i]));
						count++;
					}
				}
				if (count == 0) {
					System.out.println(codeName+" not found in the course list.");
				}
				System.out.print("Do you wish to start over? (Y / N): ");
				doneCheck = keyboard.next();
				if(doneCheck.equalsIgnoreCase("N"))
					done = true;
				else {
					System.out.println("\nGoing back to the beginning...\n");
				}
			}// end of second if
			
			else if (answer == 3) {
			
				double creditTaken = 0.0;
				System.out.print("Type in the courses you have taken so far (ex. COMPXXX,COMPYYY...): ");
				String courseTaken = keyboard.next();
				String [] courseInput = courseTaken.split(",");
				Course [] entireList = CompSci.getCourseList();
				
				for (int i = 0; i < entireList.length; i++) {
					for(int j = 0; j<courseInput.length; j++) {
						if(courseInput[j].equals(entireList[i].getCodeC()))
							creditTaken += entireList[i].getCredit();
					}
				}
				
				System.out.println("You have taken "+creditTaken+" credits.");
				String courseToTake = "";

				for(int i = 0; i < entireList.length; i++) {
					boolean tag = false;
				
					for(int j = 0; j < courseInput.length; j++) {
						if(!courseInput[j].equals(entireList[i].getCodeC()))
							continue;
						if(!courseInput[j].equals(entireList[i].getCodeC()) && j == courseInput.length-1)
							tag = false;
						else {
							tag = true;
							break;
						}
					}
					if(!tag)
						courseToTake += entireList[i]+"\n";
				}
			
				System.out.println("You should take these courses next semester: \n"+courseToTake+"\n");
				System.out.print("Do you wish to start over? (Y / N): ");
				doneCheck = keyboard.next();
				if(doneCheck.equalsIgnoreCase("N"))
					done = true;
				else {
					System.out.println("\nGoing back to the beginning...\n");
				}
			}// end of third if
			else {
				System.out.println("Program will be closed...");
				done = true;
			}
		}    
		
	keyboard.close();
	closing();
		
	}

	public static void welcome() {
		System.out.println("===========================================================");
		System.out.println("\t**Welcome to Course Setting Program**");
		System.out.println("===========================================================");
	}
	
	public static void options() {
		System.out.println("\t1. Check the course list");
		System.out.println("\t2. Check the prerequisite information");
		System.out.println("\t3. Check the rest of course");
		System.out.println("\t4. Close the program");
		System.out.print("\nChoose one from the options: ");
	}
	
	public static void option1() {
		System.out.println("\nYou chose to check the course list.");
		System.out.println("\t1. See every course");
		System.out.println("\t2. See Computer Science core");
		System.out.println("\t3. See Complementary core");
		System.out.println("\t4. See Computer Sciences electives");
		System.out.println("\t5. See Mathematics electives");
		System.out.println("Note: Minor or General electives courses are not listed in this program. Please consult the undergraduate calendar.");
		System.out.println("\thttps://www.concordia.ca/academics/undergraduate/calendar/current/sec71/71-70.html#b71.70.1");
		System.out.print("\nChoose one from the options: ");
	}
	
	public static void closing() {
		System.out.println("\n===========================================================");
		System.out.println("\tThanks for using this program");
		System.out.println("===========================================================");
	}
	
}
