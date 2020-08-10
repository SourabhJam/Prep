package isPrimeNumber;

public class Application {

	
	public static void testCase1() {
		int num = 11;
		
		boolean isPrime = isPrime(num);
		
		
		System.out.println("Number: " + num);
		if(isPrime == true) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}
	
	public static void testCase2() {
		int num = 20;
		
		boolean isPrime = isPrime(num);
		
		
		System.out.println("Number: " + num);
		if(isPrime == true) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
	}
	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<10; ++i) {
			//System.out.println(i);
			
			if(num % i == 0 ) {
				if(i != 1 || i != num) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testCase1();
		testCase2();
		
		
		
		
	}

	

}
