
public class Application {

	static int strInStr(String s1, String s2) {
		for(int i=0; i<s1.length() ; i++) {
			boolean found = false;
			int j=0;
			for(; j<s2.length(); j++) {
				if( i+j > s1.length()-1) {
					break;
				}
				if( s1.charAt(i+j) != s2.charAt(j)){
					break;
				}
			}
			
			if( j == s2.length()) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int index = strInStr("hello", "low");
		System.out.println(index);
		
		index = strInStr("hello", "llo");
		System.out.println(index);

		index = strInStr("GeeksForGeeks", "For");
		System.out.println(index);

	}

}
