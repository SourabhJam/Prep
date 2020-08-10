
public class Node {
	private int data;
	private Node next;
	
	public Node(int data) {
		this.data = data;
	}

	public Node getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Node Is: " + this.data);
	}

	public void setNext(int toAdd) {
		// TODO Auto-generated method stub
		this.next = new Node(toAdd);
		
	}

	public void setNext(Node previous) {
		// TODO Auto-generated method stub
		this.next = previous;
	}
}
