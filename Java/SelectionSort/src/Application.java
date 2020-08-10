
public class Application {

	public static void displayArr(int[] set) {

		System.out.print("{");
		for (int i = 0; i < set.length - 1; ++i) {
			System.out.print(set[i] + ", ");
		}
		System.out.print(set[set.length - 1]);
		System.out.println("}");
	}

	public static void selectionSort(int[] set) {

		int length = set.length;

		for (int i = 0; i < length - 1; i++) {
		
			int smallestIndex = i;
			
			for (int j = i + 1; j < length; j++)
				if (set[j] < set[smallestIndex])
					smallestIndex = j;

			int temp = set[smallestIndex];
			set[smallestIndex] = set[i];
			set[i] = temp;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] set = new int[] { 1, 4, 6, 8, 3, 8, 0, 2, 5, 8 };

		System.out.print("Original: ");
		displayArr(set);

		selectionSort(set);

		System.out.print("Sorted: ");
		displayArr(set);

	}

}
