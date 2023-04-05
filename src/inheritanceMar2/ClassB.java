package inheritanceMar2;

public class ClassB extends ClassA {
	int c = 20;

	void m() {
		this.c = 50;
		System.out.println("B.m() : " + (a + b + c));
	}

	public static void main(String[] args) {
		ClassA A = new ClassA();
		System.out.println("b value before m() : " + A.b); // 10
		A.m();
		System.out.println("b value before m() : " + A.b); // 20
		
		
		ClassB B = new ClassB();
		System.out.println("\nc value before m() : " + B.c);// 20
		B.m();
		System.out.println("c value before m() : " + B.c);// 50Bb); // 20
		
		
		System.out.println("\nb value inside scope of A : " + A.b); // 20
		System.out.println("b value outside scope of A : " + B.b); // 20
	}
}
