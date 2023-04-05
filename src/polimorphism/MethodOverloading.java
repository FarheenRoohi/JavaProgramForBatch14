package polimorphism;

public class MethodOverloading {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	float add(float f, int b) {
		return f + b;
	}

	double add(double d, int a, float f, int b) {
		return d + a + f + b;
	}
	float add(float g,float m) {
		return g+m;
	}
	

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
       int result = mol.add(20,25);
	System.out.println(result);
	// System.out.println(mol.add(20,25));
	int result1  = mol.add(20, 25,40);
	System.out.println(result1);
	float result3 = mol.add(40f, 30);
	System.out.println(result3);
	double result4 = mol.add(30d, 30, 40f, 25);
	System.out.println(result4);
	System.out.println(mol.add(10.7f, 10.5f));
	
	}

}
