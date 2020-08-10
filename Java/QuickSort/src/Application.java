
public class Application {

	public static void sort(int set[], int left, int right) 
    { 
        if (left < right) { 
            int middle = (left + right) / 2; 
  
            sort(set, left, middle); 
            sort(set, middle + 1, right); 
  
            merge(set, left, middle, right); 
        } 
    } 
	public static void merge(int set[], int left, int middle, int right) {
		
		int n1 = middle - left + 1;
		int n2 = right - middle;

		int L[] = new int[n1];
		int R[] = new int[n2];

	
		for (int i = 0; i < n1; ++i) {
			L[i] = set[left + i];
		}
			
		for (int j = 0; j < n2; ++j) {
			R[j] = set[middle + 1 + j];
		}
			
		
		int i = 0;
		int j = 0;

		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				set[k] = L[i];
				i++;
			} else {
				set[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			set[k] = L[i];
			i++;
			k++;
		}


		while (j < n2) {
			set[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void displayArr(int[] set) {

		System.out.print("{");
		for (int i = 0; i < set.length - 1; ++i) {
			System.out.print(set[i] + ", ");
		}
		System.out.print(set[set.length - 1]);
		System.out.println("}");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] set = new int[] { 1, 4, 8, 2, 9, 3, 85, 9, 3, 9, 3, 8, 2 };
		
		System.out.print("Original: ");
		displayArr(set);
		
		sort(set, 0, set.length - 1);
		
		System.out.print("New: ");
		displayArr(set);
	}
	

}
