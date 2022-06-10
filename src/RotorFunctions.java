import java.util.Arrays;

public class RotorFunctions {

	private static Rotor[] rotorsArray = new Rotor[3];

	public static void rotateRotor(String[] rotor, Rotor rotorObject){
		String tempIndexHolder = rotor[0];
		for(int i = 0; i < 25; i++){
			rotor[i] = rotor[i+1];
		}
		rotor[25] = tempIndexHolder;
		rotorObject.incrementRotorShiftCount();
	}

	public static void setRotorsArray(Rotor[] arr){
		rotorsArray = arr;
	}

	private static int calcIndexDifference(String result, Rotor rotorObject){
		int a = letterToNumberHashMap.letterToNumber(result);
		int b = rotorObject.getRotorShiftCount();
		if(a - b >= 0){
			return Math.abs(a - b);
		}
		return Math.abs(25 - a - b);
	}

	private static int calcReflectedIndexDifference(String result, Rotor rotorObject){
		int a = Arrays.asList(rotorObject.getRotor()).indexOf(result);
		int b = rotorObject.getRotorShiftCount();
		if(a + b > 25){
			return Math.abs(a + b - 25);
		}
		return a + b;
	}

	public static void traverseRotors(String letterMessage){
		String[] rotorOne = rotorsArray[0].getRotor();
		String rotorOneTurnoverPoint = rotorsArray[0].getTurnoverPoint();
		String rotorOneCurrentTurnoverPoint = rotorsArray[0].getLastIndex();

		String[] rotorTwo = rotorsArray[1].getRotor();
		String rotorTwoTurnoverPoint = rotorsArray[1].getTurnoverPoint();
		String rotorTwoCurrentTurnoverPoint = rotorsArray[1].getLastIndex();

		String[] rotorThree = rotorsArray[2].getRotor();

		rotateRotor(rotorOne, rotorsArray[0]);
		if(rotorOneTurnoverPoint.equals(rotorOneCurrentTurnoverPoint)){
			rotateRotor(rotorTwo, rotorsArray[1]);
			if(rotorTwoTurnoverPoint.equals(rotorTwoCurrentTurnoverPoint)){
				rotateRotor(rotorThree, rotorsArray[2]);
			}
		}

		int letNum = letterToNumberHashMap.letterToNumber(letterMessage);
		String resultOne = rotorOne[letNum];
		String resultTwo = rotorTwo[calcIndexDifference(resultOne, rotorsArray[0])];
		String resultThree = rotorThree[calcIndexDifference(resultTwo,rotorsArray[1])];
		System.out.println(resultThree);

		int rotorToReflecIndex = Arrays.asList(rotorThree).indexOf(resultThree);
		String reflectorLetter = Character.toString((char) rotorToReflecIndex + 65);
		reflectorLetter = Reflector.getReflectedLetter(reflectorLetter);
		System.out.println(reflectorLetter);

		int rotorThreeIndex = Arrays.asList(rotorThree).indexOf(reflectorLetter);
		resultThree = Character.toString((char) rotorThreeIndex + 65);
		int rotorTwoIndex = calcReflectedIndexDifference(resultThree, rotorsArray[1]);
		resultTwo = Character.toString((char) rotorTwoIndex + 65);
		int rotorOneIndex = calcReflectedIndexDifference(resultTwo, rotorsArray[0]);
		resultOne = Character.toString((char) rotorOneIndex + 65);
	}
}
