
public class Application {
	private static void getPermutations(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				getPermutations(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "ABC";  
        //Permutation permutation = new Permutation(); 
        getPermutations(word, 0, word.length() - 1);

	}

}
