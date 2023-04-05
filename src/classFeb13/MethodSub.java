package classFeb13;

public class MethodSub {

	public static void main(String[] args) {
		MethodSub ms = new MethodSub();
		int result = ms.sub(90, 40);
		System.out.println("Result=" + result);
	}

	int sub(int a, int b) {
		int c = a - b;
		return c;

	}
}
