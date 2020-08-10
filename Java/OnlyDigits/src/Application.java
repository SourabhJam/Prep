
public class Application {

	//no digits
	public static void testCase1() {
		String word = "Sourabh";
		boolean isOnlyDigits = isOnlyDigits(word);
		
		System.out.println("Word: " + word);
		if(isOnlyDigits == true) {
			System.out.println("Only Digits\n");
		}else {
			System.out.println("Not Only Digits\n");
		}
	}
	
	//all digits
	public static void testCase2() {
		String word = "484021492";
		boolean isOnlyDigits = isOnlyDigits(word);
		
		System.out.println("Word: " + word);
		if(isOnlyDigits == true) {
			System.out.println("Only Digits\n");
		}else {
			System.out.println("Not Only Digits\n");
		}
	}
	
	//mix of digits and letters
	public static void testCase3() {
		String word = "S2ou4ra8bh";
		boolean isOnlyDigits = isOnlyDigits(word);
		
		System.out.println("Word: " + word);
		if(isOnlyDigits == true) {
			System.out.println("Only Digits\n");
		}else {
			System.out.println("Not Only Digits\n");
		}
	}
	public static boolean isOnlyDigits(String word) {
		for(int i=0;i<word.length();++i) {
			boolean isDigit = isDigit(word.charAt(i));
			
			if(isDigit == false) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean isDigit(char letter) {
		
		if(letter == '0' || letter == '1' || letter == '2' || letter == '3' || letter == '4' || letter == '5' || letter == '6' || letter == '7'|| letter == '8' || letter == '9' ) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testCase1();
		testCase2();
		testCase3();

	}

}
