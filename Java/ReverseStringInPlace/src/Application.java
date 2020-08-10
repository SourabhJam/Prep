
public class Application {

	public static void reverseInPlace(StringBuilder word) {
		
		//System.out.println(word.charAt(0));
		int startIndex = 0;
		int endIndex = word.length() - 1;
		
		System.out.println(startIndex);
		System.out.println(endIndex);
		
		while(startIndex < endIndex) {
			char first;
			char second;
			
			first = word.charAt(startIndex);
			second = word.charAt(endIndex);
			
			word.setCharAt(startIndex, second);
			word.setCharAt(endIndex, first);
			
			++startIndex;
			--endIndex;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder name = new StringBuilder("Sourabh");
		
		System.out.println("Before: " + name);
		reverseInPlace(name);
		System.out.println("After: " + name);
		

	}

}
