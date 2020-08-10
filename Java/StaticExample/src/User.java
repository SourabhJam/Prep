
public class User {
	private String name;
	private static int numOfUsers = 0;
	
	public User(String name) {
		this.name = name;
		numOfUsers = numOfUsers + 1;
	}
	
	
	public int getNumUsers() {
		return this.numOfUsers;
	}
}
