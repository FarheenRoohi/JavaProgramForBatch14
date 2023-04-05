package primitiveData;

public class Feb17IfElseHw {

	public static void main(String[] args) {
		int m = 40;
		int r = 15;
		int p = 18;
		int n = 18;
		
		if (m >= n) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}
		if (m <= n) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not elgible to vote");
		}
		if (p == n) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligble to vote");
		}
		if (r >= n) {
			System.out.println("eligble to vote");

		} else {
			System.out.println("not eligible to vote");
			
		}
		
		String bankName = "Bank of America";
		
		String bankName1 = "Bank of America";
		String bankName2 = "Chase";
		String bankName3 = "Welsforgo";
		String bankName4 = "Bank of Sun prairie";
		String bankName5 = "Bank of Madison";
		
		if (bankName1 == bankName) {
			System.out.println("welcome to Bank of America");
		} else if (bankName2 == bankName) {
			System.out.println("Welcome to Chase");
		} else if (bankName3 == bankName) {
			System.out.println("welcome to Welsforgo");
		} else {
			System.out.println("Bank of Sun Prairie");
		}
		}
	}


