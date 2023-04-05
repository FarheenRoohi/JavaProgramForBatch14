package primitiveData;

public class Feb17Condition {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		int c = 70;
		int d = 25;
		// only if block
		// if(a<=b) {
		// System.out.println("both the numbers are equal");
		// }
		// if(a==b) {
		// System.out.println("both the number are equal");

		// }
		// if-else (to check one condition)
		if (a == b) {
			System.out.println("both the numbers are equal");

		} else {
			System.out.println("both the numbers are not equal ");

		}
		if (c != b) {
			System.out.println("both the numbers are equal");

		} else {
			System.out.println("both the numbers are not equal");

		}
		// multiple condition else if.( to check more than one condition)

		int m = 15;
		int n = 25;
		int o = 70;
		int p = 90;
		if (m >= n && m >= o) {
			System.out.println("m is greater");
		} else if (n >= m && n >= o) {
			System.out.println(" n is greater");
		} else {
			System.out.println("o is greater");

		}

	}
}
