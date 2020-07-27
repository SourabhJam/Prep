
public class Bike implements Activity {
	
	private String name;
	private int cost;
	private int length;
	
	public Bike(String name, int cost, int length) {
		this.name = name;
		this.cost = cost;
		this.length = length;
	}
	
	public void display(){
		System.out.println("Bike");
		System.out.println("______________");
		System.out.println("Name: " + this.name);
		System.out.println("Cost: $" + this.cost);
		System.out.println("Length: " + this.length + " miles");
	}

	
}
