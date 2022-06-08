import java.util.Scanner;

public class Keyboard {
	private static String spacelessMessage;

	public static void rotorSelectionPrompt(Scanner scnr){
		System.out.println("Pick three rotors to use in machine.");
		System.out.println("Options: I II III IV V");

		System.out.println("First rotor: ");
		String rotorPositionOne = scnr.nextLine();
		System.out.println("Second rotor: ");
		String rotorPositionTwo = scnr.nextLine();
		System.out.println("Third rotor: ");
		String rotorPositionThree = scnr.nextLine();

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
		spacelessMessage = message.replaceAll(" ", "");
		for(char letter : spacelessMessage.toCharArray()){
			if(!Character.isLetter(letter)){
				System.out.println("Error: \"" + letter + "\" is not a letter. Please enter message again.");
				messageInput(scnr);
			}
		}
	}

	public static void launchToRotor(){
		for(int i = 0; i <= spacelessMessage.length(); i++){
			String letterMessage = spacelessMessage.substring(i, i+1);
			RotorFunctions.traverseRotors(letterMessage);
		}
	}
}
