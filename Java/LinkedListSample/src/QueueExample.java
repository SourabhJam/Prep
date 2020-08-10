import java.util.*;

public class QueueExample {
	public static void Example()
	{
		Queue<String> line = new LinkedList<String>();
		
		line.add("first");
		line.add("second");
		line.add("third");
		
		String element = line.remove();
		System.out.println(element);
	}
}
