package inheritanceMar2;

public class ClassA {
	int a = 10;
	int b = 10;

	void m() {
		this.a = 10;
		b = 20;
		System.out.println("A.m() : " + (a + b));
	}

	public static void main(String[] args) {
		ClassA A = new ClassA();
		A.m();
	}
}
