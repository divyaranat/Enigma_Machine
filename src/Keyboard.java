import java.util.Scanner;

public class Keyboard {

	private static String spacelessMessage;

	public static void rotorSelectionPrompt(Scanner scnr){
		System.out.println("Pick three rotors to use in machine.");
		System.out.println("Options: I II III IV V");

		System.out.print("First rotor: ");
		String rotorPositionOne = scnr.nextLine();
		rotorPositionOne = rotorPositionOne.toUpperCase();

		String rotorPositionTwo;
		do {
			System.out.print("Second rotor: ");
			rotorPositionTwo = scnr.nextLine();
			rotorPositionTwo = rotorPositionTwo.toUpperCase();
			if(rotorPositionOne.equals(rotorPositionTwo)){
				System.out.println("Rotor " + rotorPositionTwo + " has already been selected. Please choose a different rotor.");
			}
		} while(rotorPositionTwo.equals(rotorPositionOne));

		String rotorPositionThree;
		do {
			System.out.print("Third rotor: ");
			rotorPositionThree = scnr.nextLine();
			rotorPositionThree = rotorPositionThree.toUpperCase();
			if(rotorPositionThree.equals(rotorPositionTwo) || rotorPositionThree.equals(rotorPositionOne)){
				System.out.println("Rotor " + rotorPositionThree + " has already been selected. Please choose a different rotor.");
			}
		} while(rotorPositionThree.equals(rotorPositionOne) || rotorPositionThree.equals(rotorPositionTwo));

		System.out.println("Rotor selection complete.");
		System.out.println();

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
		System.out.println();
	}

	public static void encryptionInfo(){
		System.out.println("Initial rotor settings: " + RotorFunctions.getRotorPositions());
		System.out.print("Encrypted Message: ");
	}

	public static void launchToRotor(){
		for(int i = 0; i < spacelessMessage.length(); i++){
			String letterMessage = spacelessMessage.substring(i, i+1);
			System.out.print(RotorFunctions.traverseRotors(letterMessage));
		}
		System.out.println();
	}

	public static void selectRotorPositions(Scanner scnr){
		System.out.println("Input rotor settings.");

		System.out.print("Rotor One: ");
		String rotorOnePosition = scnr.nextLine().toUpperCase();

		System.out.print("Rotor Two: ");
		String rotorTwoPosition = scnr.nextLine().toUpperCase();

		System.out.print("Rotor Three: ");
		String rotorThreePosition = scnr.nextLine().toUpperCase();

		RotorFunctions.setRotorPosition(rotorOnePosition, rotorTwoPosition, rotorThreePosition);
	}

}
