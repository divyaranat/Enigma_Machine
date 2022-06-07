public class RotorFunctions {
	public static void rotateRotor(int[] rotor){
		int tempIndexHolder = rotor[0];
		for(int i = 0; i < 25; i++){
			rotor[i] = rotor[i+1];
		}
		rotor[25] = tempIndexHolder;
	}
}
