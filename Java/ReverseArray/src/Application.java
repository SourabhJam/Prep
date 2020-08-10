
public class Application {

	public static void revArray(int[] set) {
		int length = set.length;

		int start = 0;
		int end = length - 1;

		int first = 0;
		int second = 0;

		while (start < end) {
			// System.out.println(set[start]);
			// System.out.println(set[end]);

			first = set[start];
			second = set[end];

			set[start] = second;
			set[end] = first;

			++start;
			--end;
		}
	}



	public static void displayArray(int[] set) {

		System.out.print("{");

		int i;
		for (i = 0; i < set.length - 1; ++i) {
			System.out.print(set[i] + ",");
		}

		System.out.print(set[i]);
		System.out.print("}");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] set = new int[] { 1, 2, 3, 4, 5 };
		int[] set2 = new int[] { 1, 2, 3, 4, 5, 6 };

		System.out.println("Original");
		displayArray(set2);

		revArray(set2);

		System.out.println("\nReversed");
		displayArray(set2);

	}

}
