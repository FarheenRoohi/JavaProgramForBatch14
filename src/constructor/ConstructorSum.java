package constructor;

public class ConstructorSum {
	int a;
	int b;
	short s;
	float g;

	ConstructorSum(int c, int d) {
		 a = c;
		 b = d;

		System.out.println(c + d);
		System.out.println(a + b);
	}

	ConstructorSum(int c, float g) {
		System.out.println(c + g);
        this.a = c;
        this.g = g;
        this.b = c;
	}

	ConstructorSum(short k, int a, float g) {
		this.s = k;
		this.a = a;
		this.g = g;
		System.out.println((short) s + a + g);

	}

	void sum() {

		System.out.println(a + b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(s + a + g);
	}

	public static void main(String[] args) {
		ConstructorSum cs = new ConstructorSum(10, 20);
		ConstructorSum cs1 = new ConstructorSum(10, 10.5f);
		ConstructorSum cs2 = new ConstructorSum((short) 100, 10, 10.5f);
		// cs2.sum();
		cs2.sum();
		

	}

}
