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
		rotateRotor(rotorsArray[0].getRotor());
		if(rotorsArray[0].getTurnoverPoint().equals(rotorsArray[0].getLastIndex())){
			rotateRotor(rotorsArray[1].getRotor());
		}
		if(rotorsArray[1].getTurnoverPoint().equals(rotorsArray[1].getLastIndex())){
			rotateRotor(rotorsArray[2].getRotor());
		}
	}
}
