
public class Application {

	
	private static void reverseWord(String word, int index) {
		
		if(index < 0) {
			return;
		}
		// TODO Auto-generated method stub
		System.out.print(word.charAt(index));
		reverseWord(word,--index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Sourabh";
		reverseWord(word,word.length() - 1);
	}

	
}
