import java.util.HashMap;

public class letterToNumberHashMap {

	private static HashMap<String, Integer> letToNumHMap = new HashMap<>();

	public static void activateLetterToNumberHashMap(){
		for(int i = 0, j = 65; i <= 25; i++, j++){
			letToNumHMap.put(Character.toString((char)j), i);
		}

	}

	public static int letterToNumber(String letter){
		System.out.println("h " + letter);
		return letToNumHMap.get(letter);
	}
}
