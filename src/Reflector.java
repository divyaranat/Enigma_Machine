import java.util.HashMap;

public class Reflector {
	private static HashMap<String, String> reflectorHMap = new HashMap<>();

	Reflector(){
		reflectorHMap.put("A", "Y");
		reflectorHMap.put("B", "R");
		reflectorHMap.put("C", "U");
		reflectorHMap.put("D", "H");
		reflectorHMap.put("E", "Q");
		reflectorHMap.put("F", "S");
		reflectorHMap.put("G", "L");
		reflectorHMap.put("H", "D");
		reflectorHMap.put("I", "P");
		reflectorHMap.put("J", "X");
		reflectorHMap.put("K", "N");
		reflectorHMap.put("L", "G");
		reflectorHMap.put("M", "O");
		reflectorHMap.put("N", "K");
		reflectorHMap.put("O", "M");
		reflectorHMap.put("P", "I");
		reflectorHMap.put("Q", "E");
		reflectorHMap.put("R", "B");
		reflectorHMap.put("S", "F");
		reflectorHMap.put("T", "Z");
		reflectorHMap.put("U", "C");
		reflectorHMap.put("V", "W");
		reflectorHMap.put("W", "V");
		reflectorHMap.put("X", "J");
		reflectorHMap.put("Y", "A");
		reflectorHMap.put("Z", "T");
	}

	public static String getReflectedLetter(String letter){
		return reflectorHMap.get(letter);
	}
}
