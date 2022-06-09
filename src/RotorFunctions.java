import java.util.Arrays;

public class RotorFunctions {

	private static Rotor[] rotorsArray = new Rotor[3];

	public static void rotateRotor(String[] rotor){
		String tempIndexHolder = rotor[0];
		for(int i = 0; i < 25; i++){
			rotor[i] = rotor[i+1];
		}
		rotor[25] = tempIndexHolder;
	}

	public static void setRotorsArray(Rotor[] arr){
		rotorsArray = arr;
	}

	public static void traverseRotors(String letterMessage){
		String[] rotorOne = rotorsArray[0].getRotor();
		String rotorOneTurnoverPoint = rotorsArray[0].getTurnoverPoint();
		String rotorOneCurrentTurnoverPoint = rotorsArray[0].getLastIndex();

		String[] rotorTwo = rotorsArray[1].getRotor();
		String rotorTwoTurnoverPoint = rotorsArray[1].getTurnoverPoint();
		String rotorTwoCurrentTurnoverPoint = rotorsArray[1].getLastIndex();
		String[] rotorThree = rotorsArray[2].getRotor();

		rotateRotor(rotorOne);
		if(rotorOneTurnoverPoint.equals(rotorOneCurrentTurnoverPoint)){
			rotateRotor(rotorTwo);
			if(rotorTwoTurnoverPoint.equals(rotorTwoCurrentTurnoverPoint)){
				rotateRotor(rotorThree);
			}
		}

		int letNum = letterToNumberHashMap.letterToNumber(letterMessage);
		String resultOne = rotorOne[letNum];
		System.out.println("1" + resultOne);
		String resultTwo = rotorTwo[letterToNumberHashMap.letterToNumber(resultOne)];
		System.out.println("2" + resultTwo);
		String resultThree = rotorThree[letterToNumberHashMap.letterToNumber(resultTwo)];
		System.out.println(resultThree);

		int rotorToReflecIndex = Arrays.asList(rotorThree).indexOf(resultThree);
		String reflectorLetter = Character.toString((char) rotorToReflecIndex + 65);
		reflectorLetter = Reflector.getReflectedLetter(reflectorLetter);

		int rotorThreeIndex = Arrays.asList(rotorThree).indexOf(reflectorLetter);
		resultThree = Character.toString((char) rotorThreeIndex + 65);
		int rotorTwoIndex = Arrays.asList(rotorTwo).indexOf(resultThree);
		resultTwo = Character.toString((char) rotorTwoIndex + 65);
		int rotorOneIndex = Arrays.asList(rotorOne).indexOf(resultTwo);
		resultOne = Character.toString((char) rotorOneIndex + 65);
		System.out.println(resultOne);
	}
}
