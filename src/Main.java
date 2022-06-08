import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Keyboard.rotorSelectionPrompt(scnr);
		menu(scnr);
	}

	public static void menu(Scanner scnr){
		char selection;
		do{
			Keyboard.messageInput(scnr);
			Keyboard.launchToRotor();
			System.out.println("-MENU-");
			System.out.println("'N': Encrypt a new message.");
			System.out.println("'Q': To Quit.");
			System.out.print("Selection: ");
			selection = scnr.nextLine().charAt(0);
		} while(selection != 'Q' || selection != 'q');
	}
}
