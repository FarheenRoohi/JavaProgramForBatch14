package classFeb13;

public class StaticMethodFeb27 {
	int a = 30;
	static int b = 70;

	public static void main(String[] args) {
	System.out.println( b);
	//static method does not allow non stsatic variable or method ,to access we need 
	//create object.
	StaticMethodFeb27 sm = new StaticMethodFeb27();
	System.out.println(sm.a);
	sm.bill();
     pay();
	//or
	 StaticMethodFeb27.pay();
	}
	void bill() {
		System.out.println( "This is a bill(instance) method");
	}
	static void pay() {
		System.out.println("This is a pay(static)metod");
	}

}
