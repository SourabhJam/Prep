import java.util.Arrays;

public class Application {

	public static String removeDuplicateChar(String word) {
		
		if (word == null || word.length() < 2) {
			return word;
		}

		int pos = 1; 
		char[] characters = word.toCharArray();

		for (int i = 1; i < word.length(); i++) {
			int j;
			for (j = 0; j < pos; ++j) {
				if (characters[i] == characters[j]) {
					break;
				}
			}
			if (j == pos) {
				characters[pos] = characters[i];
				++pos;
			} else {
				characters[pos] = 0;
				++pos;
			}
		}

		return word;
		//return characters;
	}

	public static void main(String[] args) {
		String name = "aabscs";
		
		System.out.println("Original: " + name);
		
		name = removeDuplicateChar(name);
		
		System.out.println("New: " + name);
		
	}

}
