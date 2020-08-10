
public class Application {

	public static void displayArr(int[] set) {

		System.out.print("{");
		for (int i = 0; i < set.length - 1; ++i) {
			System.out.print(set[i] + ", ");
		}
		System.out.print(set[set.length - 1]);
		System.out.println("}");
	}

	public static void bubbleSort(int[] set) {
		int length = set.length;

		for (int i = 0; i < length - 1; i++) {

			for (int j = 0; j < length - i - 1; j++) {
				if (set[j] > set[j + 1]) {
					
					int temp = set[j];
					set[j] = set[j + 1];
					set[j + 1] = temp;
				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] set = new int[] { 1, 4, 6, 8, 3, 8, 0, 2, 5, 8 };

		System.out.print("Original: ");
		displayArr(set);
		
		bubbleSort(set);
		
		System.out.print("Sorted: ");
		displayArr(set);

	}

}
