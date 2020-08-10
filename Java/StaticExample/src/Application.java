
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User("Sourabh");
		User u2 = new User("Sai");
		User u3 = new User("Sri");
		
		
		int numUsers = u1.getNumUsers();
		System.out.println("Num Of Users: " + numUsers);
	}

}
