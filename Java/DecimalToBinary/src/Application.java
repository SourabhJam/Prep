
public class Application {

	private static int numToBinary(int num) {
		// TODO Auto-generated method stub
		String binString = Integer.toBinaryString(num);
		int binary =Integer.parseInt(binString);  
		return binary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int binary = 0;
		
		binary = numToBinary(num);
		
		System.out.println("Number: " + num);
		System.out.println("Binary: " + binary);
	}

	

}
