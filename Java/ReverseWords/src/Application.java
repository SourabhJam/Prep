
public class Application {

	public static void main(String[] args) {

		String s = "This.is.list.of.words";
		
		String[] words = s.split("\\.");
		for(String word : words) {
			System.out.println(word);
		}
		
		System.out.println("______________________");
		for(int i=words.length-1 ; i>=0; i--) {
			System.out.println(words[i]);
		}
	}

}
