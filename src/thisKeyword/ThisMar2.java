package thisKeyword;
// method calling with this key
public class ThisMar2 {
	void m() {
		int b = 15;
		System.out.println("b="+b);
		
	}void m1(){
		int a =10;
		this.m();
	 System.out.println("a="+a);	
	}

	public static void main(String[] args) {
		ThisMar2 tm = new ThisMar2();
		tm.m1();
		tm.m();
       System.out.println("this is main metod");
	}

}
