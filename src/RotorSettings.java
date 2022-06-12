public class RotorSettings {

	public static void rotorSelection(String rotorPositionOne, String rotorPositionTwo, String rotorPositionThree){
		String[][] rotorOneArray = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
									{"E","K","M","F","L","G","D","Q","V","Z","N","T","O","W","Y","H","X","U","S","P","A","I","B","R","C","J"}};

		String[][] rotorTwoArray = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
									{"A","J","D","K","S","I","R","U","X","B","L","H","W","T","M","C","Q","G","Z","N","P","Y","F","V","O","E"}};

		String[][] rotorThreeArray = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
									  {"B","D","F","H","J","L","C","P","R","T","X","V","Z","N","Y","E","I","W","G","A","K","M","U","S","Q","O"}};

		String[][] rotorFourArray = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
									 {"E","S","O","V","P","Z","J","A","Y","Q","U","I","R","H","X","L","N","F","T","G","K","D","C","M","W","B"}};

		String[][] rotorFiveArray = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
									 {"V","Z","B","R","G","I","T","Y","U","P","S","D","N","H","L","X","A","W","M","J","Q","O","F","E","C","K"}};

		String[][] relflectorArray = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
									  {"Y","R","U","H","Q","S","L","D","P","X","N","G","O","K","M","I","E","B","F","Z","C","W","V","J","A","T"}};

		String[][] positionOneArray = new String[26][26];
		String[][] positionTwoArray = new String[26][26];
		String[][] positionThreeArray = new String[26][26];

		String positionOneTurnoverPoint;
		String positionTwoTurnoverPoint;
		String positionThreeTurnoverPoint;

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
			default -> {
				System.out.println("Error: rotor one switch");
				positionOneTurnoverPoint = null;
			}
		}

		switch (rotorPositionTwo) {
			case "I" -> {
				positionTwoArray = rotorOneArray;
				positionTwoTurnoverPoint = "Q";
			}
			case "II" -> {
				positionTwoArray = rotorTwoArray;
				positionTwoTurnoverPoint = "E";
			}
			case "III" -> {
				positionTwoArray = rotorThreeArray;
				positionTwoTurnoverPoint = "V";
			}
			case "IV" -> {
				positionTwoArray = rotorFourArray;
				positionTwoTurnoverPoint = "J";
			}
			case "V" -> {
				positionTwoArray = rotorFiveArray;
				positionTwoTurnoverPoint = "Z";
			}
			default -> {
				System.out.println("Error: rotor two switch");
				positionTwoTurnoverPoint = null;
			}
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
			default -> {
				System.out.println("Error: rotor three switch");
				positionThreeTurnoverPoint = null;
			}
		}

		Rotor rotorOne = new Rotor(positionOneArray, positionOneTurnoverPoint);
		Rotor rotorTwo = new Rotor(positionTwoArray, positionTwoTurnoverPoint);
		Rotor rotorThree = new Rotor(positionThreeArray, positionThreeTurnoverPoint);

		RotorFunctions.setRotors(rotorOne, rotorTwo, rotorThree, relflectorArray);
	}
}
