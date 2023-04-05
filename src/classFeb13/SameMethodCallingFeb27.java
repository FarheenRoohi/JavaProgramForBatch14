package classFeb13;

public class SameMethodCallingFeb27 {

	public static void main(String[] args) {
            SameMethodCallingFeb27 in = new SameMethodCallingFeb27();
            in.samsung1();
            System.out.println("This is Main Method");
	}

	
	
	void samsung () {
		System.out.println("This is samsung");		
	}
		void samsung1() {
			samsung();
			System.out.println("This is iphone");
		}
	}

