import java.util.ArrayList;

public class ArrayListExample {
	
	// List which uses arrays.
	// Holds any object.
	public static void ArrayListTest() {
		// Array list is list which uses array
		// https://www.geeksforgeeks.org/arraylist-in-java/
		ArrayList list = new ArrayList();
		list.add("sai");
		list.add(1);
		
		// looping: https://www.geeksforgeeks.org/for-each-loop-in-java/
		for( Object x : list) {
			System.out.println(x.toString());
		}		
	}
	
	// List which uses specific data types.
	public static void ArrayListForSpecificDataType() {
		ArrayList<String> sports = new ArrayList<String>();
		
		sports.add("basketball");
		sports.add("football");
		sports.add("baseball");
		
		for( String sport : sports) {
			System.out.println(sport);
		}
		
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		
		for( int num : oddNumbers) {
			 System.out.println("Odd number: " + num );
		}
	}
}
