
public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	public void insert(int toAdd) {
		if(head == null) {
			head = new Node(toAdd);
			return;
		}
		
		Node current = head;
		
		while(current.getNext() != null) {
			current = current.getNext();
		}
		
		current.setNext(toAdd);
		
	}
	
	public void display() {
		
		Node current = head;
		
		while(current != null) {
			current.display();
			current = current.getNext();
		}
		
		
		
		

	}

	public void reverse() {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		Node previous = head;
		Node next;
		
		while(current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
			
		}
		
		head.setNext(null);
		head = previous;
	}
}
