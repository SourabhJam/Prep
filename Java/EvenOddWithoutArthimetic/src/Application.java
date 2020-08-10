
public class Application {

	public static void testCaseEven() {
		int num = 50;
		boolean isOddOrEven = isOdd(num);
		
		System.out.print(num + ":");
		if(isOddOrEven == true) {
			System.out.println(" Odd");
		}else {
			System.out.println(" Even");
		}
	}
	
	public static void testCaseOdd() {
		int num = 53;
		boolean isOddOrEven = isOdd(num);
		
		System.out.print(num + ":");
		if(isOddOrEven == true) {
			System.out.println(" Odd");
		}else {
			System.out.println(" Even");
		}
	}
	
	private static boolean isOdd(int num) {
		// TODO Auto-generated method stub
		int newNum = num & 1;
		//System.out.println(newNum);
		
		if(newNum == 1) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCaseEven();
		testCaseOdd();
	
	}

	

}
