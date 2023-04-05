package tryCatchMar10;

public class DemoTryCatch {

	public static void main(String[] args) {
		// arthmetic excetion ,run time exception,unchecked exception
		System.out.println("start");
		int a = 20;
		int b = 0;
		try {
			b = a / 0;
			System.out.println("before exception");
		} catch (Exception e) {
			System.out.println("Exception in DemoTryCatch: " + e.getMessage());
			//e.printStackTrace();
		//	b = a / 1;
		}
		System.out.println("after exception");
		System.out.println("a = " + b);
	}
}
