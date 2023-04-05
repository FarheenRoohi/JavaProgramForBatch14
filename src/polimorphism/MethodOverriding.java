package polimorphism;

public class MethodOverriding {
         
	public static void main(String[] args) {
		MethodOverriding mor = new MethodOverriding();
		mor.add(20, 30);
        A objb = new A();
        objb.add(30,90);
	}
      void add(int a,int b) {
    	  System.out.println("class parent add ="+(a+b));
      }
}
class A {
	void add(int a, int b) {
	  	  System.out.println("class child add="+(a+b));
}
class B extends A{
	void add(int a, int b) {
  	  System.out.println("class child add="+(a+b));
  	  }
}
}