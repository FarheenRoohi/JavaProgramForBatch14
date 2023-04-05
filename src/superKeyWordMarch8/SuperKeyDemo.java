package superKeyWordMarch8;

public class SuperKeyDemo {

	public static void main(String[] args) {
		B b = new B();
		b.print();
	}

}
class A{
	int a =30;
	
}
class B extends A{ //immediate parent class is A
	int a = 20 ;
	
	void print() {
		System.out.println("a="+super.a);
	}
}