package constructor;

public class ConstructorDemoFeb28 {

	ConstructorDemoFeb28() {
		System.out.println("This is a zero arg  constructor");

	}

	ConstructorDemoFeb28(int a) {
		System.out.println("a=" + a);
		System.out.println("This is a one arg constructor with int");
	}

	ConstructorDemoFeb28(int b, float c) {
		System.out.println("b = " + b + "," + "c = " + c);
		System.out.println("This is a two args constructor with int and float");
	}

	ConstructorDemoFeb28(int e, float g, short f) {
		System.out.println("e =" + e + "," + "g =" + g + "," + "f =" + f);
		System.out.println("This is a Three Args constructor with value int, float and short");

	}

	ConstructorDemoFeb28(float g, short w, int m, long l) {
		System.out.println("float =" + g + "," + " w =" + w + "," + "m =" + m + "l =" + "," + l);
		System.out.println("This is a four Args constructor with value int, float and short and long" + "");

	}

	public static void main(String[] args) {
		ConstructorDemoFeb28 cd = new ConstructorDemoFeb28();

		ConstructorDemoFeb28 cd1 = new ConstructorDemoFeb28(10);
		System.out.println(" this is main end");
		ConstructorDemoFeb28 cd3 = new ConstructorDemoFeb28(50, 5.20f);
		ConstructorDemoFeb28 cd4 = new ConstructorDemoFeb28(3, 10.5f, (short) 200);
		ConstructorDemoFeb28 cd5 = new ConstructorDemoFeb28(15.6f, (short) 450, 25, (long) 20000);

	}

}
