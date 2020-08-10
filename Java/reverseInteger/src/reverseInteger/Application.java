package reverseInteger;

public class Application {

	private static int reverseNum(int num) {

		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 46279;

		int rev = reverseNum(num);
		System.out.println("Number: " + num);
		System.out.println("Reversed: " + rev);
	}

}
