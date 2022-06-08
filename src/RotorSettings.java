public class RotorSettings {
	public static void rotorSelection(String rotorPositionOne, String rotorPositionTwo, String rotorPositionThree){
		String[] rotorOneArray = {"E","K","M","F","L","G","D","Q","V","Z","N","T","O","W","Y","H","X","U","S","P","A","I","B","R","C","J"};
		String[] rotorTwoArray = {"A","J","D","K","S","I","R","U","X","B","L","H","W","T","M","C","Q","G","Z","N","P","Y","F","V","O","E"};
		String[] rotorThreeArray = {"B","D","F","H","J","L","C","P","R","T","X","V","Z","N","Y","E","I","W","G","A","K","M","U","S","Q","O"};
		String[] rotorFourArray = {"E","S","O","V","P","Z","J","A","Y","Q","U","I","R","H","X","L","N","F","T","G","K","D","C","M","W","B"};
		String[] rotorFiveArray = {"V","Z","B","R","G","I","T","Y","U","P","S","D","N","H","L","X","A","W","M","J","Q","O","F","E","C","K"};

		rotorPositionOne = rotorPositionOne.toUpperCase();
		rotorPositionTwo = rotorPositionTwo.toUpperCase();
		rotorPositionThree = rotorPositionThree.toUpperCase();

		String[] positionOneArray = new String[26];
		String[] positionTwoArray = new String[26];
		String[] positionThreeArray = new String[26];

		String positionOneTurnoverPoint = "";
		String positionTwoTurnoverPoint = "";
		String positionThreeTurnoverPoint = "";

		switch (rotorPositionOne) {
			case "I" -> {
				positionOneArray = rotorOneArray;
				positionOneTurnoverPoint = "Q";
			}
			case "II" -> {
				positionOneArray = rotorTwoArray;
				positionOneTurnoverPoint = "E";
			}
			case "III" -> {
				positionOneArray = rotorThreeArray;
				positionOneTurnoverPoint = "V";
			}
			case "IV" -> {
				positionOneArray = rotorFourArray;
				positionOneTurnoverPoint = "J";
			}
			case "V" -> {
				positionOneArray = rotorFiveArray;
				positionOneTurnoverPoint = "Z";
			}
			default -> System.out.println("Error: rotor one switch");
		}

		switch (rotorPositionTwo) {
			case "I" -> {
				positionTwoArray = rotorOneArray;
				positionTwoTurnoverPoint = "Q";
			}
			case "II" -> {
				positionTwoArray = rotorTwoArray;
				positionOneTurnoverPoint = "E";
			}
			case "III" -> {
				positionTwoArray = rotorThreeArray;
				positionOneTurnoverPoint = "V";
			}
			case "IV" -> {
				positionTwoArray = rotorFourArray;
				positionOneTurnoverPoint = "J";
			}
			case "V" -> {
				positionTwoArray = rotorFiveArray;
				positionOneTurnoverPoint = "Z";
			}
			default -> System.out.println("Error: rotor two switch");
		}

		switch (rotorPositionThree) {
			case "I" -> {
				positionThreeArray = rotorOneArray;
				positionThreeTurnoverPoint = "Q";
			}
			case "II" -> {
				positionThreeArray = rotorTwoArray;
				positionThreeTurnoverPoint = "E";
			}
			case "III" -> {
				positionThreeArray = rotorThreeArray;
				positionThreeTurnoverPoint = "V";
			}
			case "IV" -> {
				positionThreeArray = rotorFourArray;
				positionThreeTurnoverPoint = "J";
			}
			case "V" -> {
				positionThreeArray = rotorFiveArray;
				positionThreeTurnoverPoint = "Z";
			}
			default -> System.out.println("Error: rotor three switch");
		}
		Rotor[] rotorsArray = new Rotor[3];
		rotorsArray[0] = new Rotor(positionOneArray, positionOneTurnoverPoint);
		rotorsArray[1] = new Rotor(positionTwoArray, positionTwoTurnoverPoint);
		rotorsArray[2] = new Rotor(positionThreeArray, positionThreeTurnoverPoint);
		RotorFunctions.setRotorsArray(rotorsArray);
	}
}
