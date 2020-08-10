import java.util.HashMap;

public class Application {

	private static int[] removeDuplicates(int[] set) {
		// TODO Auto-generated method stub

		int length = set.length;
		int[] newSet = new int[length];

		int j = 0;

		for (int i = 0; i < length - 1; i++) {
			if (set[i] != set[i + 1]) {
				newSet[j++] = set[i];
			}
		}
		newSet[j++] = set[length - 1];

		for (int i = 0; i < j; i++) {
			set[i] = newSet[i];
		}
		
		return newSet;
	}
	
	public static void displayArray(int[] set) {
		
		System.out.print("{");
		for(int i=0;i<set.length - 1;++i) {
			System.out.print(set[i] + ",");
		}
		System.out.print(set[set.length - 1]);
		System.out.println("}");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] set = new int[] { 1, 2, 3, 3, 7, 7, 8, 9, 10 };

		System.out.print("Original: ");
		displayArray(set);
		
		set = removeDuplicates(set);
		
		System.out.print("\nNew: ");
		displayArray(set);

	}

}
