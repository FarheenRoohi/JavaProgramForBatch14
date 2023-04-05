package inheritance2;

public class ClassA {
 
	public static void main(String[] args) {
		ClassA a =new ClassA();
		a.Show();
		System.out.println("a="+a);
	     B  b = new B();
		b.Show();
		b.Play();
		System.out.println("a="+b.a+"b="+b.c);
		D  d = new D();
		d.Show();
		d.Display();
		System.out.println("a="+d.a+"D="+d.b);
		

	}
	
      int a = 12;
	 void Show() {
		 System.out.println("this is a A parent class");
		 
	 }
		void printmessage() {
			
		}
		 
	 }
  class D extends ClassA {
		int b  = 5;
		void Display() {
			System.out.println("D is a child ciass of A");
		}
		
	}
  class B extends  ClassA{
		 int c = 10;
		 void Play() {
			 System.out.println("B is the child of A class");
		 }

}