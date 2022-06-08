import java.util.HashMap;

public class letterToNumberHashMap {

	private static HashMap<String, Integer> letToNumHMap = new HashMap<>();

	letterToNumberHashMap(){
		for(int i = 1, j = 65; i <= 26; i++, j++){
			letToNumHMap.put(Character.toString((char)j), i);
		}
	}

	public static int letterToNumber(String letter){
		return letToNumHMap.get(letter);
	}
}
