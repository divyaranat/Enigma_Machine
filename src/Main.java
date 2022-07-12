import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Keyboard.rotorSelectionPrompt(scnr);
		menu(scnr);
	}

	public static void menu(Scanner scnr){
		char selection;
		boolean continueLoop = true;
		do{
			System.out.println("-MENU-");
			System.out.println("'N': Encrypt a new message.");
			System.out.println("'D': Decrypt a Message.");
			System.out.println("'S': Set Rotor Positions.");
			System.out.println("'R': Reset Rotor Positions.");
			System.out.println("'Q': To Quit.");
			System.out.print("Selection: ");
			selection = scnr.nextLine().toUpperCase().charAt(0);
			System.out.println();
			switch(selection){
				case 'N':
					System.out.println("---Encryption---");
					Keyboard.messageInput(scnr);
					Keyboard.encryptionInfo();
					Keyboard.launchToRotor();
					break;
				case 'D':
					System.out.println("---Decryption---");
					Keyboard.selectRotorPositions(scnr);
					Keyboard.messageInput(scnr);
					Keyboard.launchToRotor();
					break;
				case 'S':
					System.out.println("---Set Rotor Positions---");
					Keyboard.selectRotorPositions(scnr);
					break;
				case 'R':
					break;
				case 'Q':
					continueLoop = false;
				default:
					System.out.println("Invalid entry. Please try again.");
			}
			System.out.println();
		} while(continueLoop);
	}
}
