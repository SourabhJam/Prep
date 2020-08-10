import java.util.LinkedList;

public class LinkedListExample {
	// https://www.geeksforgeeks.org/data-structures/linked-list/
	
	public static void LinkedListSample()
	{
		LinkedList list = new LinkedList();
		list.add("basketball");
		list.add(100);
		
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void LinkedListUsingGenerics()
	{
		LinkedList<String> sports = new LinkedList<String>();
		sports.add("basketball");
		
		for(String sport : sports) {
			System.out.println(sport);
		}
	}
}
