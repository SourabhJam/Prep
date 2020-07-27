
public class Movie implements Activity {
	
	private String name;
	private int cost;
	private String rating;
	
	public Movie(String name, int cost,String rating) {
		
		// TODO Auto-generated constructor stub
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}
	
	public void display(){
		System.out.println("\nMovie");
		System.out.println("______________");
		System.out.println("Name: " + this.name);
		System.out.println("Cost: $" + this.cost);
		System.out.println("Rating: " + this.rating);
	}

	
}
