import java.util.HashMap;

public class Application {

	
	public static boolean isAnagram(String word1, String word2) {
		if(word1.length() != word2.length()) {
			return false;
		}
		
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		
		for(int i=0;i<word1.length();++i) {
			boolean isContains = map1.containsKey(word1.charAt(i));
			
			if(isContains == false) {
				map1.put(word1.charAt(i), 1);
			}else {
				int value = map1.get(word1.charAt(i));
				map1.put(word1.charAt(i), value + 1);
			}
		}
		
		//System.out.println("Map 1");
		//System.out.println(map1);
		
		for(int i=0;i<word2.length();++i) {
			boolean isContains = map2.containsKey(word2.charAt(i));
			
			if(isContains == false) {
				map2.put(word2.charAt(i), 1);
			}else {
				int value = map2.get(word2.charAt(i));
				map2.put(word2.charAt(i), value + 1);
			}
		}
		
		//System.out.println("Map 2");
		//System.out.println(map2);
		
		boolean isSame = map1.equals(map2);
		return isSame;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "bob";
		String word2 = "obb";
		
		
		boolean isAnagram = isAnagram(word1,word2);
		
		
		System.out.println("Word 1: " + word1);
		System.out.println("Word 2: " + word2);
		if(isAnagram == true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
