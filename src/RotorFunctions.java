import java.util.Arrays;

public class RotorFunctions {

	private static String[][] rotorOne;
	private static String[][] rotorTwo;
	private static String[][] rotorThree;
	private static String[][] reflector;

	private static String rotorOneTurnoverPoint;
	private static String rotorTwoTurnoverPoint;

	public static void rotateRotor(String[][] rotor){
		String tempIndexHolderZero = rotor[0][0];
		String tempIndexHolderOne = rotor[1][0];
		for(int i = 0; i < 25; i++){
			rotor[0][i] = rotor[0][i+1];
			rotor[1][i] = rotor[1][i+1];
		}
		rotor[0][25] = tempIndexHolderZero;
		rotor[1][25] = tempIndexHolderOne;
	}

	public static void setRotors(Rotor rotorOneObject, Rotor rotorTwoObject, Rotor rotorThreeObject, String[][] reflectorArray){
		rotorOne = rotorOneObject.getRotorArray();
		rotorTwo = rotorTwoObject.getRotorArray();
		rotorThree = rotorThreeObject.getRotorArray();
		reflector = reflectorArray;

		rotorOneTurnoverPoint = rotorOneObject.getTurnoverPoint();
		rotorTwoTurnoverPoint = rotorTwoObject.getTurnoverPoint();
	}

	public static String traverseRotors(String letterMessage){
		rotateRotor(rotorOne);
		String rotorOneCurrentTurnoverPoint = rotorOne[0][25];

		if(rotorOneTurnoverPoint.equals(rotorOneCurrentTurnoverPoint)){
			rotateRotor(rotorTwo);
			String rotorTwoCurrentTurnoverPoint = rotorTwo[0][25];

			if(rotorTwoTurnoverPoint.equals(rotorTwoCurrentTurnoverPoint)){
				rotateRotor(rotorThree);
			}
		}

		int letNum = indexOf(reflector, letterMessage, 0);
		String resultOne = rotorOne[1][letNum];
		String resultTwo = rotorTwo[1][indexOf(rotorOne, resultOne, 0)];
		String resultThree = rotorThree[1][indexOf(rotorTwo, resultTwo, 0)];

		String reflectorLetter = reflector[1][indexOf(rotorThree, resultThree, 0)];

		resultThree = rotorThree[0][indexOf(reflector, reflectorLetter, 0)];
		resultThree = rotorThree[0][indexOf(rotorThree, resultThree, 1)];

		resultTwo = rotorTwo[0][indexOf(rotorThree, resultThree, 0)];
		resultTwo = rotorTwo[0][indexOf(rotorTwo, resultTwo, 1)];

		resultOne = rotorOne[0][indexOf(rotorTwo, resultTwo, 0)];
		resultOne = rotorOne[0][indexOf(rotorOne, resultOne, 1)];

		String finalResult = reflector[0][indexOf(rotorOne, resultOne, 0)];
		return finalResult;
	}

	public static int indexOf(String[][] rotorArray, String result, int arraySelect){
		int i;
		for(i = 0; i <= 25; i++){
			if(rotorArray[arraySelect][i].equals(result)){
				break;
			}
		}
		return i;
	}
}
