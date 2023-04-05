package encapsulationMar8;

public class EncapsulationDemo {
	private int a;   //getter and setter
	private int b;

	void setData(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println();
	}

	void getData() {
		System.out.println("a=" + a + "b=" + b);
	}

	public static void main(String[] args) {
		A a = new A();
		a.setData(10, 200);
		a.getData();
	}
}

class A {
	private int a;
	private int b;

	void setData(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	void getData() { 
		System.out.println("a=" + a +" ," +"b=" + b);
	}

}
