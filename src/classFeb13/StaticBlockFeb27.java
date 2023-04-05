package classFeb13;

public class StaticBlockFeb27 {
	// instance block
	{
		System.out.println("This is instance block");
	}
	// static block this will execute first
	static {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		System.out.println("This is main method start");
		StaticBlockFeb27 sb = new StaticBlockFeb27();
		System.out.println("This is the end of main method");

	}

}
