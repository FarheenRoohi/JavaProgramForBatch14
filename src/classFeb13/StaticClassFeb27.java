package classFeb13;

public class StaticClassFeb27 {

	public static void main(String[] args) {
		OuterClasss.InnerClass.display();
         Samsung.Motorola obj = new Samsung.Motorola();
         obj.display();
	}

	// creating the class in class
	// we can create class(outer) but not as static
	// we can create inner class as static and method,
	class OuterClasss {
		static class InnerClass {
			static void display() {
				System.out.println("This is inner static class and static Method in outerclass");

			}

		}

	}

	class Samsung {
		static class Motorola {
			void display() {
				System.out.println("This is the display Method");
			}

		}
	}

}
