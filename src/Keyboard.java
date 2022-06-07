import java.util.Scanner;

public class Keyboard {
	public static void rotorSelectionPrompt(Scanner scnr){
		System.out.println("Pick three rotors to use in machine.");
		System.out.println("Options: I II III IV V");

		System.out.println("First rotor: ");
		String rotorPositionOne = scnr.next();
		System.out.println("Second rotor: ");
		String rotorPositionTwo = scnr.next();
		System.out.println("Third rotor: ");
		String rotorPositionThree = scnr.next();

		System.out.println("Rotor selection complete.");

		RotorSettings.rotorSelection(rotorPositionOne, rotorPositionTwo, rotorPositionThree);
	}

	public static void messageInput(Scanner scnr){
		System.out.print("Enter message: ");
		String message = scnr.nextLine();
		messageFilter(message, scnr);
	}

	private static void messageFilter(String message, Scanner scnr){
		message = message.replaceAll("   ", "  ");
		message = message.replaceAll("  ", " ");
		String spacelessMessage = message.replaceAll(" ", "");
		for(char letter : spacelessMessage.toCharArray()){
			if(!Character.isLetter(letter)){
				System.out.println("Error: \"" + letter + "\" is not a letter. Please enter message again.");
				messageInput(scnr);
			}
		}
	}

}
