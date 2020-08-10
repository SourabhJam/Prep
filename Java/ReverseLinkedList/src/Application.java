
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		list.display();
		
		list.reverse();
		
		System.out.println("NEW LIST");
		list.display();

	}

}
